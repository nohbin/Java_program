s = "this is python"


print(s.upper())

print(s.count(s))
print(s.replace('python' , 'java'))
print('!'.join(s))
print(s.find('python'))

print('=' * 30)

s = 'blockdmask'
r1 = s.count('k')
print(f"s.count('k') : {r1}")


r1 = s.find('k')
print(f"s.find('k') : {r1}")

s = 'Blockdmask'
r2 = s.upper()
print(f"{s}.upper () : {r2}")

r2 = s.lower()
print(f"{s}.lower() : {r2}")

myList = [1, 1.25, 1, 'word', [1, 2, [3,4]]]

print(myList)
print(myList[4])