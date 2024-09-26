package selj.example.meformer.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercises")
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val exerciseId: Int = 0,
    val courseId: Int, // Référence vers le cours
    val question: String, // Question de l'exercice
    val correctAnswer: String?, // Réponse correcte
    val answerChoices: List<String>?, // Liste des choix pour QCM
    val exerciseType: ExerciseType // Enum : 'QCM', 'OPEN_QUESTION'
)

enum class ExerciseType {
    QCM, OPEN_QUESTION
}

