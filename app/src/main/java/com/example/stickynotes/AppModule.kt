package com.example.stickynotes

import android.app.Application
import androidx.room.Room
import com.example.stickynotes.feature_notes.data.data_source.NoteDataBase
import com.example.stickynotes.feature_notes.data.repositories.NoteRepositoryImpl
import com.example.stickynotes.feature_notes.domain.repository.NoteRepository
import com.example.stickynotes.feature_notes.domain.usecase.AddNoteUseCase
import com.example.stickynotes.feature_notes.domain.usecase.DeleteNoteUseCase
import com.example.stickynotes.feature_notes.domain.usecase.GetNoteUseCase
import com.example.stickynotes.feature_notes.domain.usecase.GetNotesUseCase
import com.example.stickynotes.feature_notes.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDataBase(app: Application): NoteDataBase {
        return Room.databaseBuilder(app, NoteDataBase::class.java, NoteDataBase.DATABASE_NAME)
            .build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDataBase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUseCase = AddNoteUseCase(repository),
            getNoteUseCase = GetNoteUseCase(repository)
        )
    }
}