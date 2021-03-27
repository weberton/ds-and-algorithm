module BucketSort

  def self.sort(array = ARRAY)
    b = {}
    array.each{ |i| (b[(i * array.size).round] ||= []) << i}
        
    r = []
    (0..array.size).each{ |i| r << (b[i] ||= []).sort!}  

    r.flatten
  end
end