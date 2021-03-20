class Heap

  attr_reader :arr

  def initialize(a)
    @arr = a
    @len = @arr.size
  end

  def max_heapify(i, n = @len)
    left = (2 * i) + 1
    right = (2 * i) + 2
    largest = i
    if left < n && @arr[left] > @arr[i]
      largest = left
    end

    if right < n && @arr[right] > @arr[largest]
      largest = right
    end

    if largest != i
      @arr[i], @arr[largest] = @arr[largest], @arr[i]
      max_heapify(largest, n)
    end
  end
  
  def build_heap
    (@arr.size / 2).downto(0) do |i|      
      max_heapify(i)
    end
  end

  def sort    
    build_heap
    (@len - 1).downto(0) do |i|      
      @arr[i], @arr[0] = @arr[0], @arr[i]      
      max_heapify(0, i)
    end
    p @arr
  end
end

a = [2,8,4,9,5,1]
heap = Heap.new(a)
heap.sort

b = [5,56,1,2,4,7,8,4,4,99,84]
heap = Heap.new(b)
heap.sort