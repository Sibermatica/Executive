# Attention!
This new is very important. We discovered a very seriously several bug on `Data.java`

This bug is called `CVE-2353-9623` and it is too much seriously because it affects on the
byte data processing. Concrete, this class uses this formula:
    `currentByteQuantity / Math.pow(CURRENT_BYTE_PROCESSING_LEVEL, CURRENT_BIT_OR_BYTE_QUANTITY);`

But this formula does return an invalid result, the correct formula is this:
    `currentByteQuantity * Math.pow(CURRENT_BYTE_PROCESSING_LEVEL, CURRENT_BIT_OR_BYTE_QUANTITY);`

This bug is already fixed in the update 2.0!

**Att: Sibermatica™ Corporation**