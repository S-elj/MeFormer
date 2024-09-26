package selj.example.meformer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recommendations")
data class Recommendation(
    @PrimaryKey(autoGenerate = true)
    val recommendationId: Int = 0,
    val studentId: Int, // ID de l'utilisateur (élève)
    val recommendedCourseId: Int, // ID du cours recommandé
    val recommendationReason: String?, // Raison de la recommandation
    val recommendationDate: Long // Date de la recommandation (timestamp)
)
