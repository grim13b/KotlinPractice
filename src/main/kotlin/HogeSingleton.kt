package org.grim3lt.example.kotlin

class HogeSingleton private constructor(
    private var id: Int = 0,
    private var value: String = "",
    private var description: String = ""

) {
    companion object {
        @Volatile
        private var instance: HogeSingleton? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: HogeSingleton().also {
                it.setStatus(0, "hoge", "hani")
                instance = it
            }
        }
    }

    fun setStatus(id: Int, value: String, description: String) {
        this.id = id
        this.value = value
        this.description = description
    }

    override fun toString(): String {
        return String.format("ID: %d, VALUE: %s, DESCRIPTION: %s", id, value, description)
    }
}
