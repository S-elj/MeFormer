package selj.example.meformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import selj.example.meformer.data.model.Exercise

@Dao
interface ExerciseDao {

    @Query("SELECT * FROM exercises WHERE courseId = :courseId")
    suspend fun getExercisesByCourseId(courseId: Int): List<Exercise>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExercise(exercise: Exercise)

    @Query("DELETE FROM exercises WHERE exerciseId = :exerciseId")
    suspend fun deleteExerciseById(exerciseId: Int)
}
