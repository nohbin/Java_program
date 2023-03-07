# List 에 대하여 배워봅시다.

myList = [1, 1.25, 1, 'word', [1, 2, [3,4,['python',2]]]]

print(myList)

print(myList[4][2][2][0:1])
# list 안에 list 를 찾을 경우 위처럼 사용


a = [5,2,3,1,4]
print(a)
a.append(10)
print(a)
a.sort()
print(a)
a.reverse()
print(a)
b = [5,2,3,1,4]
print('a : ' , b.index(3), b[4]) # b.index(3) 은 list 안에 3의 위치번호를 호출, 

b = [5,2,3,1,4]
b.insert(1,7)
print(b)

b= [5,2,3,1,4]
del b[2]
print(b)

