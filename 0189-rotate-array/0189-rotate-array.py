class Solution:
    def rotate(self, arr: List[int], k: int) -> None:
        n = len(arr)
        k %= n
        def reverse(start: int, end: int):
            while start < end:
                arr[start], arr[end] = arr[end], arr[start]
                start += 1
                end -= 1
        reverse(0, n-1)
        reverse(0, k-1)
        reverse(k, n-1)