package selj.example.meformer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Int = 0,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val userType: UserType, // Enum: 'PARENT', 'STUDENT', 'TEACHER'
    val subscriptionPlan: String?, // Spécifique pour le parent
    val classLevel: String?, // Niveau de l’élève
    val subjectSpecialty: String? // Spécialité de l'enseignant
)

enum class UserType {
    PARENT, STUDENT, TEACHER
}

