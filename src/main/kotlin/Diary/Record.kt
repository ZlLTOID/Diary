package Diary

import java.time.LocalDateTime

class Record(dateTime: LocalDateTime, note: String) {
    private var dateTime: LocalDateTime
    private var note: String

    init {
        this.dateTime = dateTime
        this.note = note
    }

    fun getDateTime(): LocalDateTime
    {
        return dateTime
    }

    override fun toString(): String {
        return "$dateTime $note"
    }
}