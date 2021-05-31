package com.mikhailn45.voicer.listRecord

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mikhailn45.voicer.database.RecordDatabaseDao
import java.lang.IllegalArgumentException

class ListRecordViewModelFactory(
    private val databaseDao: RecordDatabaseDao
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListRecordViewModel::class.java)) {
            return ListRecordViewModel(databaseDao) as T
        }
        throw IllegalArgumentException("Unknown VIewModel class")
    }
}