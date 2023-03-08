#  Tuple ex)

tuple1 = (2.3,)

float1 = (2.3)

print(tuple1)
print(float1)
print(type(tuple1))
print(type(float1))

tuple2 = 1,2,3,4,5
print(tuple2)
print(type(tuple2))

tuple1 = 9,8,7,6
print(tuple1[0])

tuple1 = 1,2,3
tuple2 = 4,5,6

print(tuple1 *2 + tuple2)
print(len(tuple1 *2 + tuple2))

#팩킹

t = 'foo', 'bar' , 'baz' , 'qux'
print(t)
print(t[0])
print(t[-1])

# 언팩킹

a = 1
t = a
print(t)
a = 2
print(t)

t = 'foo', 'bar' , 'baz' , 'qux'
print(type(t))
(x1, x2, x3, x4) = t
print(x1,x2,x3,x4)
print(type(x1),type(x2),type(x3),type(x4))
print(type(t))
