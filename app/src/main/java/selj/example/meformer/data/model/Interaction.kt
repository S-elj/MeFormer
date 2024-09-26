package selj.example.meformer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "interactions")
data class Interaction(
    @PrimaryKey(autoGenerate = true)
    val interactionId: Int = 0,
    val studentId: Int, // ID de l'utilisateur (élève)
    val courseId: Int, // ID du cours
    val interactionType: InteractionType, // Enum : 'VIDEO_WATCH', 'TEXT_READ', 'EXERCISE_SUBMISSION'
    val interactionDate: Long, // Date de l'interaction (timestamp)
    val progress: Int?, // Pourcentage de progression dans le cours (facultatif)
    val score: Int? // Score obtenu lors de la soumission d'exercice (si applicable)
)

enum class InteractionType {
    VIDEO_WATCH, TEXT_READ, EXERCISE_SUBMISSION
}
