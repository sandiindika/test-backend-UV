def sort_string(s):
    char_list = list(s)
    
    for i in range(len(char_list)):
        for j in range(i + 1, len(char_list)):
            if char_list[i] > char_list[j]:
                char_list[i], char_list[j] = char_list[j], char_list[i]
    
    return ''.join(char_list)

def group_anagrams(words):
    anagram_dict = {}
    
    for word in words:
        sorted_word = sort_string(word)
        
        if sorted_word in anagram_dict:
            anagram_dict[sorted_word].append(word)
        else:
            anagram_dict[sorted_word] = [word]
    
    return list(anagram_dict.values())

#words = ["listen", "potato", "tomato", "dog", "god", "taco", "cat", "act", "racecar"]
words = ["listen", "pot", "part", "opt", "trap", "silent", "top"]
print(group_anagrams(words))