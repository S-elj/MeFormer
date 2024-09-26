package selj.example.meformer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "progress")
data class Progress(
    @PrimaryKey(autoGenerate = true)
    val progressId: Int = 0,
    val studentId: Int, // ID de l'utilisateur (élève)
    val courseId: Int, // ID du cours
    val completionPercentage: Int = 0, // Progrès (en %)
    val scoreAverage: Float = 0.0f, // Moyenne des scores obtenus
    val lastUpdated: Long // Dernière mise à jour du progrès (timestamp)
)
