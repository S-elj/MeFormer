package selj.example.meformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import selj.example.meformer.data.model.Recommendation

@Dao
interface RecommendationDao {

    @Query("SELECT * FROM recommendations WHERE studentId = :studentId")
    suspend fun getRecommendationsForStudent(studentId: Int): List<Recommendation>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecommendation(recommendation: Recommendation)

    @Query("DELETE FROM recommendations WHERE recommendationId = :recommendationId")
    suspend fun deleteRecommendationById(recommendationId: Int)
}
