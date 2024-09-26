package selj.example.meformer.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "enrollments")
data class Enrollment(
    @PrimaryKey(autoGenerate = true)
    val enrollmentId: Int = 0,
    val studentId: Int, // ID de l'utilisateur (élève)
    val courseId: Int, // ID du cours
    val enrollmentDate: Long, // Date d'inscription (timestamp)
    val completionPercentage: Int = 0, // Progression (en %)
    val lastAccessed: Long? // Dernier accès au cours (timestamp)
)

