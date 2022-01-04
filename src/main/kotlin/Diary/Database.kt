package Diary

import java.time.LocalDateTime

class Database {
    private var records: List<Record> = listOf()

    fun addRecord(dateTime: LocalDateTime, note:String) {
        records = records + Record(dateTime, note)
    }

    fun findRecord(date: LocalDateTime, byTime: Boolean): List<Record> {
        var results: List<Record> = listOf()

        for (record in records) {
            if (record.getDateTime().toLocalDate() == date.toLocalDate()
                || (!byTime && record.getDateTime().toLocalTime() == date.toLocalTime())) {
                results = results + record
            }
        }

        return results
    }

    fun deleteRecord(dateTime: LocalDateTime) {
        val record = findRecord(dateTime, true)
        records = records - record.toSet()
    }
}