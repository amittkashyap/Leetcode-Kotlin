class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val length = s.count()
        val dp: Array<Boolean> = Array(length + 1) { false }
        dp[0] = true
        for (i in 0..s.count()) {
            for (j in 0 until i) if (dp[j] && wordDict.contains(s.substring(startIndex = j, endIndex = i))) {
                dp[i] = true
                break
            }
        }
        return dp[s.count()]
    }
}