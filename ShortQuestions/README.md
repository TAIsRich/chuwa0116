- Headings
# Largest Heading
## The second largest Heading
###### The smallest heading

- Styling Text

Bold: **This is bold text**
Italic: *This text is italicized*
Strikethrough: ~~This was mistaken text~~
Bold and nested italic: **This text is _extremely_ important**
All bold and italic: ***All this text is important***
Subscript: <sub>This is a subscript text</sub>
Superscript: <sup>This is a superscript text</sup>

- Quoting text:
> Text that is a quote

- Quoting code:
```
class Solution {
    public int largestVariance(String s) {
      int[] buckets=new int[26];
      for(char c:s.toCharArray())
      buckets[c-'a']++;
      int maxVariance=0;
      for(char a='a';a<='z';++a)
      for(char b='a';b<='z';++b){
      if(a==b||buckets[a-'a']==0||buckets[b-'a']==0)continue;
      int countA=0,countB=0,remainingB=buckets[b-'a'];
      for(char c:s.toCharArray()){
      if(c==a){++countA;}
      else if(c==b){++countB;--remainingB;}
      if(countB>0)maxVariance=Math.max(maxVariance,countA-countB);
      if(countB>countA&&remainingB>0){
      countB=0;
      countA=0;
      }
      }
      }
      return maxVariance;
    }
}
```
- Supported color models
The background color should be `#ffffff` for light mode and `#0d1117` for dark mode.

- Links:
You can search using [Google](https://google.com/).

- Relative links:
[Contribution guidelines for this project](docs/CONTRIBUTING.md)

- Images
![This is an image](https://myoctocat.com/assets/images/base-octocat.svg)

- Lists:
$-$ use is already performed in this file, at this time, I will only demonstrate the number list:
1. list1
2. list2
3. list3
- NestedList:
1. First list item
   - First nested list item
     - Second nested list item

- Task Lists:
Could be used to track your Leetcode completion status:
- [x] Trapping Rain Water    
- [ ] Substring With Largest Variance   
- [ ] LRU Cache