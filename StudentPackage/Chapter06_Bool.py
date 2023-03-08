
# Boolean = True , False

a = True
b = False
print(type(a))
print(type(b))

print(0) # false
print(None) # false // Null or 000

print(bool(0)) #  Bool 로 받아올시 1 = true , 0 = False

a=[1,2,3]

if a:
    print("참")
else :
    print("거짓")

# 무한 루프. a가 true 임으로 무한반복
# a= [1,2,3,4]
# while a:
#     print(a)
        

a= [1,2,3,4]
while a:
    print(a.pop())

print(a)