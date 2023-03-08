# Open()

# myFile = open("python.txt","w")
# myFile.write("Programming!")
# myFile.close()

myFile = open("pyhton.txt","w")
myFile.write("Programming! \nHello World!")
myFile.close()


# 만들어준 Python.txt 파일을 읽기모드로 열기
read_file = open("python.txt","r")
text = read_file.readline()
text1 = read_file.readline()
print("만들어준 Python.txt 파일을 읽기모드로 열기")
print(text,text1)

# 파일의 모든 줄을 읽어서 각각의 줄을 리스트로 반환
read_file = open("python.txt","r")
all_text = read_file.readlines()
print("파일의 모든 줄을 읽어서 각각의 줄을 리스트로 반환")
print(all_text)

# 줄바꿈 문자 제거
read_file = open("python.txt","r")
test_strip = read_file.readline().strip()
print(test_strip)
test_strip = read_file.readline().strip()
print("줄바꿈 문자 제거")
print(test_strip)
