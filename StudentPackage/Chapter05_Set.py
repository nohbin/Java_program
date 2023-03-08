#Set

set1 = {1,2,3,4,5}
set2 = {1,3,5,7,9}
# 합집합 | <- 사용
print(set1 | set2) 

# 교집합 & <- 사용
print(set1 & set2)

#차집합 - <- 사용
print(set1 - set2)

set1 = {1,2,3,4,5}
set1.add(6)

print(set1)

print("=" * 30)

set1 = {1,2,3,4,5}
set2 = {1,3,5,7,9}

print(type(set1) , type(set2))

# 튜플 변환
t= tuple(set1)
print('t - ', type(t), t) # 튜플 로 형변환
print('t - ',t[0],t[1:3]) # 인덱싱 사용 가능

#리스트 변환
l = list(set1)
l2 = list(set2)
print('l - ' , type(l),l) # list 로 형변환
print('l - ' , l[0],l[1:3]) # 인덱싱 사용 가능
print('l2 - ' , type(l2), l2) # l2 형변환
print('l2 - ', l2[0],l2[1:3]) # Type casting 후 indexing 진행

# 집합 자료형 활용
s1 = set([1,2,3,4,5,6,7])
s2 = set([4,5,6])
s3 = set([8,9,10])

# 교집합
print('s1 & s2 : ',s1 & s2)
print('s1 & s3 : ',s1 & s3)
print('s1 & s2 : ',s1.intersection(s2) )

#합집합
print('s1 | s2', s1 | s2)
print('s1 | s3', s1 | s3)
print('s1 | s2', s1.union(s2))

#차집합
print('s1 - s2 : ' , s1-s2)
print('s1 - s2 : ' , s1.difference(s2))

# .discard = item 에 해당하는 원소를 제거하고, 없어도 에러발생 없음
s1=set([1,2,3,4])
s1.discard(6)
print(s1)

