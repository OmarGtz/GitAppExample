package com.example.mygitappexample.data

/**
 * QuestionStore
 *
 * @author (c) 2022, UVI TECH SAPI De CV, KAVAK
 */
object QuestionStore {
    val questions = listOf<Question>(
        Question("Que es android?", listOf(
            "Es una sistema operativo para celulares",
            "Es un robot",
            "Es un tipo de comida",
            "Es el nombre de una emppresa"
        )),
        Question("Que es Kotlin?", listOf(
            "Es un lenguaje de programacion para desarrollar android",
            "Es un idioma",
            "Es un IDE de desarrollo",
            "Es un libro"
        )),
        Question("Que es xml?", listOf(
            "Es un lenguaje de etiquetas para desarrollar las pantallas en android",
            "Es un lenguaje de programacion para backend",
            "Es un tipo de base de datos",
            "Es un tipo de formato de documentos"
        )),
        Question("Que es una clase en programacion?", listOf(
            "Es un componente de una lenguaje de progracion para crear variables",
            "Es un tipo de archivo especial para crear objetos en un programa",
            "Es un lenguaje de programacion",
            "Nos ayuda a representar objetos del mundo real en nuestro programa"
        ))
    )
}