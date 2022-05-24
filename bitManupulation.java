BitMask = 1 << position;
GET = num & BitMask;
SET = num | BitMask;
CLEAR = num & ~(BitMask);
UPDATE(1) = num | BitMask;
UPDATE(0) = num & ~(BitMask);
