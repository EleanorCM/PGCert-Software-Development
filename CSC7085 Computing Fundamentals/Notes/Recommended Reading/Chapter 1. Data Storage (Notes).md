Brookshear, J., et al. _Computer Science: an Overview, Global Edition_, Pearson Education, Limited, 2019. _ProQuest Ebook Central_, https://ebookcentral.proquest.com/lib/qub/detail.action?docID=5676415.

A ==**_computational artifact_**== is ***anything* created by a human using a computer**. People use tools and abstractions to create software, datasets, media, etc.

How are these artifacts encoded and stored in computers?

## Bits and their Storage
All data, not just the numeric kind, is encoded as ==**_bits_**== - short for **binary digits**. They can also represent characters, colours and sounds.

### Boolean Operations
Conceptually, **1 = _true_** and **0 = _false_**.

Operations that manipulate true and false values are called **Boolean Operations** (after mathematician George Boole).

The operations are:
- **AND**: A conjunction between two expressions, both of which must be true
- **OR**: These statements are true when at least one of their components is true
- **XOR**: XOR is true when one expression is true and the other is false. When true it outputs the value 1 or *true*
- **NOT**: Only has 1 input, and its output is the opposite of its input. Thus if the input is true, then the output is false.

### Gates and Flip-Flops
A ==device that **produces the output** of a Boolean operation is called a **_gate_**== or **logic gate**. 

![[GatesDiagram.png]]

In modern computers, ==gates are made of **transistors**==. The digits 1 and 0 represent voltage levels - essentially **on** and **off** respectively.

Gates are the **building blocks for computers**, and Booleans are fundamental to all programming languages.

A ==**_flip-flop_** is a computer component that is a **fundamental unit of memory**==. It is a **circuit** which produces an output value of 1 or 0. The output remains constant until a short pulse from another circuit causes it to switch to the other value.

A simple flip-flop circuit with example inputs and output:

![[Flip flop IO.png]]

This output ==**will remain 1 even if we subsequently change the top input to 0**==, because the 1 from the AND gate is still in the circuit, meaning that the OR gate still outputs 1.

A computer engineer really only needs to know the **external properties** of a fiip flop, as opposed to the exact structure of a circuit. 

Because it can be set to have an output of 1 or 0, a flip-flop is one means of **==storing a bit==**. Other circuits can adjust this value by sending pulses. Therefore **lots of flip-flops inside a computer can be used to store information encoded as 1s and 0s.** 

**_Chips_** can house millions of flip-flops (see [Very Large Scale Integration](https://en.wikipedia.org/wiki/Very_Large_Scale_Integration)). Chips are then used as abstract tools in the construction of higher-level computer components.

### Hexadecimal Notation
Computers process patterns of bits. These are bit strings that can be very long, are usually in multiples of four, and are called **_streams_**.

**_Hexadecimal Notation_**, or **Base 16**, is a shorthand, using one symbol to represent a particular **combination of 4 bits** (so a stream of 12 bits can be written as 3 hexadecimal symbols). The base of 16 often follows the symbol in subscript (eg F<sub>16</sub>, which is 15<sub>10</sub>).

![[Hexadecimal.png]]

## Main Memory
A computer contains lots of flip-flops, each one capable of storing a single bit. This bit reservoir is called the computer's **_main memory_**.

### Memory Organisation
Main memory is organised into ==**_memory cells_**==, usually of 8 bits (a **byte**). Thus ==a memory cell's capacity is one byte==. A microwave has hundreds of cells in its main memory, while a desktop or smartphone has **billions**.

We visualise bits in a memory cell as being arranged in a row (although they're not really).

![[High and low order]]

Each cell has a **unique** ==**_address_**== in memory. We envision the cells as being placed in a single row and assigned addresses in **ascending numerical order** (cell 0, cell 1, cell 2, etc):

![[CellMemoryAddresses.png]]

The circuitry that holds the bits is combined with circuitry that allows other circuits to store and retrieve data from those memory cells. 
- A **read operation** is when a circuit asks for the contents of another circuit's memory cells using their memory address.
- A **write operation** is when a circuit records information in memory by requesting that certain bit pattern be placed at a particular cell's address
- Main memory is called **Random Access Memory (RAM)**, so named because of this ability to access inividual, addressable cells in any order.

Flip-flops are a good way to introduce the concept of bit storage, but most modern computers now have analogous but more complex technologies with greater miniturisation and faster response times.

The technology in modern computers store bits as tiny electric charges which dissapate quickly unless refreshed. This, they need an additional **refresh circuit** that replenishes the charges many times a second. This is called **dynamic memory** or **DRAM**.

**Synchronous DRAM (SDRAM)** refers to DRAM with additional mechanisms for decreasing retrieval times.

### Measuring Memory Capacity
Memory is actually measured in **powers of two**:
- **Kilobyte**: 1024 bytes
- **Megabyte**: 1,048,576 bytes
- **Gigabyte**: 1,073,741,824 bytes
- **Terabyte**: 1e+12 bytes

This is in contrast to the use of these prefixes in other fields based on the *denary* system, where *kilogram* is 1000 grams and *megahertz* is 1,000,000 hertz. Specialised terminology was developed for memory measurements in the 90s, but never popularised (kibi-, mebi-, gibi-, tebi- denote powers of 1024).

## Mass Storage
RAM is a volatile and relatively expensive kind of memory, and is usually of limited size. Most computers therefore have **mass storage systems**, which can include magnetic disks, CDs, DVDs, magnetic tapes, flash drives and solid-state drives. 

These are less volatile, lower cost and typically have much larger storage capacities. In many cases the storage medium can be removed from the machine for archival purposes.

Magnetic and optical mass storage systems typically have moving parts - data is written to them through mechanical motion. This means it can take significantly longer to store and retrieve data, and makes them more prone to mechanical failures than solid-state systems.

Flash drives and SSDs don't have moving parts, but other electronic factors limit their speed and longevity.

### Magnetic Systems
Magnetic technology dominates the mass storage arena, the most common form of which is the **Hard Disk Drive (HDD)**, consisting of one or more thin, spinning disks with a magnetic coating. Read/write heads traverse circles on the disks, called **cylinders**.

Cyinders contain several **tracks**, and tracks are divided into smaller arcs called **sectors**, where data is stored as a string of bits. All sectors on a disk contain the same number of bits, usually between 512 bytes and a few kilobytes.

In simple systems, each track contains the same number of sectors (with those on the outer edge of the disk storing bits in a more spaced-out way, since they are longer than the inner edge). In more advanced systems, outer tracks can contain significantly more sectors. 

In **zone-bit recording**, adjacent tracks are grouped in zones. A typical disk contains ten zones. All tracks in a zone have the same number of sectors, but each zone has more sectors per track than the zone inside of it. This allows the disk capacity to be used efficiently.
![[ZonedBitRecording.svg]]
HDD capacity depends on:
- The number of platters used
- The density of tracks and sectors on each platter

Lower capacity, compact systems may only have one platter. High capacity systems may consist of three to six platters on one spindle, with data stored on both sides of each platter.

Metrics for disk performance include:
1. **Seek time**: time to move read/write heads between tracks
2. **Rotational delay**: average time for the desired data to rotate to the read/write head (which is half the time required for a full rotation)
3. **Access time**: Seek time + rotational delay
4. **Transfer rate**: The rate at which data can be transferred to or from a disk. Transfer rate is greater for outer zones, since the read\write heads have to traverse more data in one rotation.
5. ==**Bandwidth**: The total bits that can be transferred in a unit of time (eg. 3 megabits per second)==
6. ==**Latency**: time between a request for data and its arrival==

The read/write heads don't actually touch the disk (this would slow rotation down), they float just off the surface. Even a dust particle can become jammed in between and cause a **head crash**, destroying both. Disk systems are usually in factory-sealed cases, allowing them to rotate hundreds of times per second, with transfers measured in MBs per second.

Delay times are measured in nanoseconds (billionths of a second) for electronic circuit memory, and milliseconds (thousands of a second) for disk drives.

Magnetic storage technologies that were more widely used in the past include magnetic tape, floppy disk drive. Magnetic tape is still used for archival data storage due to its low cost and extremely high latency.

### Optical Systems
#### Compact Disks (CDs)
CDs are made of reflective material covered with clear protective coating. Data is recorded on them by creating variations in their reflective surfaces and is retrieved by a laser detecting irregularities in the  spinning reflective surface.

CDs for computer data storage use essentially the same format as audio CDs (**compact disk-digital audio (CD-DA)**). Data is stored on a single track that spirals around the disk, moving from the inside out.

Data is stored at a **uniform linear density** to maximise CD capacity.

CD players vary the rotation speed to keep the playback at a particular speed, but computer CD systems spin at a faster constant rate and accomodate variable transfer rates.

#### Digital Versatile Disks (DVDs)
DVDs are made of several semi-transparent layers that serve as separate surfaces when viewed by a precisely focused red laser and provide several GBs of storage. They can store lengthy multimedia presentations. Blu-ray uses a blue-violet laser which can be focussed with very fine precision. Blu-ray disks (BDs) have over five times the capacity of a DVD, up to 100GB, storing ultra-high definition video.

#### Flash Drives
In **Flash Memory** systems, bits are stored by by sending electronic signals to the storage medium where electrons are trapped in tiny chambers of silicon dioxide. The chambers can hold the electrons captive for many years with no external power.

Data on flash drives can be accessed in byte-size units, but stored data can only be erased in large blocks. Repeated erasing damages the chambers, making flash memory unsuitable for general main memory applications where data can be quickly and repeatedly altered. 

Flash memory is, however, the mass storage of choice in digital cameras and smartphones. Because it is not sensitive to physical shock, it is also replacing HDDs in some laptop computers.

**Solid-State Drives** are larger flash memory devices designed to take the place of HDD. They are resilient to shock and vibrations, are quiet (no moving parts), and have lower access times. They are more expensive and are still considered a high-end option when buying a computer. They have a more limited lifetime than HDDs, but **wear-levelling** techniques extend their lifespan by relocating frequently altered data blocks to fresh memory locations.

