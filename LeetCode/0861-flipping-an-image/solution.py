class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        n = len(image)
        for i in range(0,n):
            left ,right = 0 , n -1
            while left <= right :
                image[i][left] , image[i][right] = image[i][right] ^ 1 , image[i][left] ^ 1
                left+=1 
                right-=1
        return image


