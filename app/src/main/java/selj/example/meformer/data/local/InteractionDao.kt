package selj.example.meformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import selj.example.meformer.data.model.Interaction

@Dao
interface InteractionDao {

    @Query("SELECT * FROM interactions WHERE studentId = :studentId AND courseId = :courseId")
    suspend fun getInteractionsByStudentAndCourse(studentId: Int, courseId: Int): List<Interaction>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertInteraction(interaction: Interaction)

    @Query("DELETE FROM interactions WHERE interactionId = :interactionId")
    suspend fun deleteInteractionById(interactionId: Int)
}
