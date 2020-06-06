
class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val dict: HashMap<Int, Int> = hashMapOf()
        var result = arrayListOf<Int>()
        nums1.forEach {
            dict.get(it)?.also { freq ->
                dict.set(it, freq + 1)
            } ?: run {
                dict.set(it, 1)
            }
        }
        nums2.forEach {
            dict.get(it)?.also { freq ->
                if (freq > 0) {
                    result.add(it)
                    dict.set(it, freq - 1)
                }
            }
        }
        return result.toIntArray()
    }
}


