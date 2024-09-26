package selj.example.meformer.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "courses")
data class Course(
    @PrimaryKey(autoGenerate = true)
    val courseId: Int = 0,
    val title: String,
    val description: String,
    val subject: String, // Matière (ex: Maths, Physique)
    val level: String, // Niveau (ex: terminale, première)
    val teacherId: Int, // Référence vers l'enseignant (id de User)
    val contentType: ContentType, // Enum : 'VIDEO', 'TEXT', 'EXERCISE'
    val videoUrl: String?, // Lien vidéo pour les cours vidéo
    val textContent: String? // Contenu texte pour les cours textuels
)

enum class ContentType {
    VIDEO, TEXT, EXERCISE
}
