package com.mikhailn45.voicer.listRecord

import androidx.lifecycle.ViewModel
import com.mikhailn45.voicer.database.RecordDatabaseDao

class ListRecordViewModel(
    dataSource: RecordDatabaseDao
) : ViewModel() {

    val database = dataSource
    val records = database.getAllRecords()

}