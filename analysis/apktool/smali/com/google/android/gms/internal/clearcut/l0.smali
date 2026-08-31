.class public final Lcom/google/android/gms/internal/clearcut/l0;
.super Ljava/lang/Object;


# static fields
.field public static volatile b:Landroid/os/UserManager; = null

.field public static volatile c:Z = false

.field public static final synthetic d:[I

.field public static final e:[I

.field public static final f:[B


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/clearcut/l0;->d:[I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v1, v0, [I

    .line 11
    .line 12
    sput-object v1, Lcom/google/android/gms/internal/clearcut/l0;->e:[I

    .line 13
    .line 14
    new-array v0, v0, [B

    .line 15
    .line 16
    sput-object v0, Lcom/google/android/gms/internal/clearcut/l0;->f:[B

    .line 17
    .line 18
    return-void

    .line 19
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/clearcut/l0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I[B)I
    .locals 2

    .line 1
    aget-byte v0, p1, p0

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 v1, p0, 0x1

    .line 6
    .line 7
    aget-byte v1, p1, v1

    .line 8
    .line 9
    and-int/lit16 v1, v1, 0xff

    .line 10
    .line 11
    shl-int/lit8 v1, v1, 0x8

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    add-int/lit8 v1, p0, 0x2

    .line 15
    .line 16
    aget-byte v1, p1, v1

    .line 17
    .line 18
    and-int/lit16 v1, v1, 0xff

    .line 19
    .line 20
    shl-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    add-int/lit8 p0, p0, 0x3

    .line 24
    .line 25
    aget-byte p0, p1, p0

    .line 26
    .line 27
    and-int/lit16 p0, p0, 0xff

    .line 28
    .line 29
    shl-int/lit8 p0, p0, 0x18

    .line 30
    .line 31
    or-int/2addr p0, v0

    .line 32
    return p0
.end method

.method public static b(I[BIILcom/google/android/gms/internal/clearcut/j;)I
    .locals 3

    .line 1
    ushr-int/lit8 v0, p0, 0x3

    .line 2
    .line 3
    const-string v1, "Protocol message contained an invalid tag (zero)."

    .line 4
    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    and-int/lit8 v0, p0, 0x7

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, v2, :cond_5

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_4

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x5

    .line 21
    if-ne v0, p0, :cond_0

    .line 22
    .line 23
    add-int/lit8 p2, p2, 0x4

    .line 24
    .line 25
    return p2

    .line 26
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/clearcut/B;

    .line 27
    .line 28
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    and-int/lit8 p0, p0, -0x8

    .line 33
    .line 34
    or-int/lit8 p0, p0, 0x4

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    :goto_0
    if-ge p2, p3, :cond_2

    .line 38
    .line 39
    invoke-static {p1, p2, p4}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget v0, p4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 44
    .line 45
    if-eq v0, p0, :cond_2

    .line 46
    .line 47
    invoke-static {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/clearcut/l0;->b(I[BIILcom/google/android/gms/internal/clearcut/j;)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    if-gt p2, p3, :cond_3

    .line 53
    .line 54
    if-ne v0, p0, :cond_3

    .line 55
    .line 56
    return p2

    .line 57
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->b()Lcom/google/android/gms/internal/clearcut/B;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    throw p0

    .line 62
    :cond_4
    invoke-static {p1, p2, p4}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    iget p1, p4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 67
    .line 68
    add-int/2addr p0, p1

    .line 69
    return p0

    .line 70
    :cond_5
    add-int/lit8 p2, p2, 0x8

    .line 71
    .line 72
    return p2

    .line 73
    :cond_6
    invoke-static {p1, p2, p4}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    return p0

    .line 78
    :cond_7
    new-instance p0, Lcom/google/android/gms/internal/clearcut/B;

    .line 79
    .line 80
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public static c(I[BIILcom/google/android/gms/internal/clearcut/b0;Lcom/google/android/gms/internal/clearcut/j;)I
    .locals 8

    .line 1
    ushr-int/lit8 v0, p0, 0x3

    .line 2
    .line 3
    const-string v1, "Protocol message contained an invalid tag (zero)."

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    and-int/lit8 v0, p0, 0x7

    .line 8
    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, v2, :cond_7

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_5

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    const/4 p3, 0x5

    .line 21
    if-ne v0, p3, :cond_0

    .line 22
    .line 23
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 p2, p2, 0x4

    .line 35
    .line 36
    return p2

    .line 37
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/clearcut/B;

    .line 38
    .line 39
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    and-int/lit8 v0, p0, -0x8

    .line 48
    .line 49
    or-int/lit8 v0, v0, 0x4

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    :goto_0
    if-ge p2, p3, :cond_3

    .line 53
    .line 54
    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    iget v2, p5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 59
    .line 60
    if-eq v2, v0, :cond_2

    .line 61
    .line 62
    move-object v3, p1

    .line 63
    move v5, p3

    .line 64
    move-object v7, p5

    .line 65
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/clearcut/l0;->c(I[BIILcom/google/android/gms/internal/clearcut/b0;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    move v1, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v1, v2

    .line 72
    move p2, v4

    .line 73
    :cond_3
    move v5, p3

    .line 74
    if-gt p2, v5, :cond_4

    .line 75
    .line 76
    if-ne v1, v0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p4, p0, v6}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return p2

    .line 82
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->b()Lcom/google/android/gms/internal/clearcut/B;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    throw p0

    .line 87
    :cond_5
    move-object v3, p1

    .line 88
    move-object v7, p5

    .line 89
    invoke-static {v3, p2, v7}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget p2, v7, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 94
    .line 95
    if-nez p2, :cond_6

    .line 96
    .line 97
    sget-object p3, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    .line 98
    .line 99
    :goto_1
    invoke-virtual {p4, p0, p3}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-static {v3, p1, p2}, Lcom/google/android/gms/internal/clearcut/m;->g([BII)Lcom/google/android/gms/internal/clearcut/m;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    goto :goto_1

    .line 108
    :goto_2
    add-int/2addr p1, p2

    .line 109
    return p1

    .line 110
    :cond_7
    move-object v3, p1

    .line 111
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 p2, p2, 0x8

    .line 123
    .line 124
    return p2

    .line 125
    :cond_8
    move-object v3, p1

    .line 126
    move-object v7, p5

    .line 127
    invoke-static {v3, p2, v7}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iget-wide p2, v7, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 132
    .line 133
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p4, p0, p2}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return p1

    .line 141
    :cond_9
    new-instance p0, Lcom/google/android/gms/internal/clearcut/B;

    .line 142
    .line 143
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p0
.end method

.method public static d(I[BILcom/google/android/gms/internal/clearcut/j;)I
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0x7f

    .line 2
    .line 3
    add-int/lit8 v0, p2, 0x1

    .line 4
    .line 5
    aget-byte v1, p1, p2

    .line 6
    .line 7
    if-ltz v1, :cond_0

    .line 8
    .line 9
    shl-int/lit8 p1, v1, 0x7

    .line 10
    .line 11
    :goto_0
    or-int/2addr p0, p1

    .line 12
    iput p0, p3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    and-int/lit8 v1, v1, 0x7f

    .line 16
    .line 17
    shl-int/lit8 v1, v1, 0x7

    .line 18
    .line 19
    or-int/2addr p0, v1

    .line 20
    add-int/lit8 v1, p2, 0x2

    .line 21
    .line 22
    aget-byte v0, p1, v0

    .line 23
    .line 24
    if-ltz v0, :cond_1

    .line 25
    .line 26
    shl-int/lit8 p1, v0, 0xe

    .line 27
    .line 28
    or-int/2addr p0, p1

    .line 29
    iput p0, p3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    .line 33
    .line 34
    shl-int/lit8 v0, v0, 0xe

    .line 35
    .line 36
    or-int/2addr p0, v0

    .line 37
    add-int/lit8 v0, p2, 0x3

    .line 38
    .line 39
    aget-byte v1, p1, v1

    .line 40
    .line 41
    if-ltz v1, :cond_2

    .line 42
    .line 43
    shl-int/lit8 p1, v1, 0x15

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    and-int/lit8 v1, v1, 0x7f

    .line 47
    .line 48
    shl-int/lit8 v1, v1, 0x15

    .line 49
    .line 50
    or-int/2addr p0, v1

    .line 51
    add-int/lit8 p2, p2, 0x4

    .line 52
    .line 53
    aget-byte v0, p1, v0

    .line 54
    .line 55
    if-ltz v0, :cond_3

    .line 56
    .line 57
    shl-int/lit8 p1, v0, 0x1c

    .line 58
    .line 59
    or-int/2addr p0, p1

    .line 60
    iput p0, p3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 61
    .line 62
    return p2

    .line 63
    :cond_3
    and-int/lit8 v0, v0, 0x7f

    .line 64
    .line 65
    shl-int/lit8 v0, v0, 0x1c

    .line 66
    .line 67
    or-int/2addr p0, v0

    .line 68
    :goto_1
    add-int/lit8 v0, p2, 0x1

    .line 69
    .line 70
    aget-byte p2, p1, p2

    .line 71
    .line 72
    if-ltz p2, :cond_4

    .line 73
    .line 74
    iput p0, p3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 75
    .line 76
    return v0

    .line 77
    :cond_4
    move p2, v0

    .line 78
    goto :goto_1
.end method

.method public static e(J[BII)I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/16 v1, -0xc

    .line 3
    .line 4
    if-eqz p4, :cond_6

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/16 v3, -0x41

    .line 8
    .line 9
    if-eq p4, v2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne p4, v2, :cond_2

    .line 13
    .line 14
    invoke-static {p2, p0, p1}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    const-wide/16 v4, 0x1

    .line 19
    .line 20
    add-long/2addr p0, v4

    .line 21
    invoke-static {p2, p0, p1}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    sget-object p1, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    .line 26
    .line 27
    if-gt p3, v1, :cond_1

    .line 28
    .line 29
    if-gt p4, v3, :cond_1

    .line 30
    .line 31
    if-le p0, v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    shl-int/lit8 p1, p4, 0x8

    .line 35
    .line 36
    xor-int/2addr p1, p3

    .line 37
    shl-int/lit8 p0, p0, 0x10

    .line 38
    .line 39
    xor-int/2addr p0, p1

    .line 40
    return p0

    .line 41
    :cond_1
    :goto_0
    return v0

    .line 42
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_3
    invoke-static {p2, p0, p1}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    sget-object p1, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    .line 53
    .line 54
    if-gt p3, v1, :cond_5

    .line 55
    .line 56
    if-le p0, v3, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    shl-int/lit8 p0, p0, 0x8

    .line 60
    .line 61
    xor-int/2addr p0, p3

    .line 62
    return p0

    .line 63
    :cond_5
    :goto_1
    return v0

    .line 64
    :cond_6
    sget-object p0, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    .line 65
    .line 66
    if-le p3, v1, :cond_7

    .line 67
    .line 68
    return v0

    .line 69
    :cond_7
    return p3
.end method

.method public static f([BILcom/google/android/gms/internal/clearcut/j;)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    aget-byte p1, p0, p1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iput p1, p2, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    invoke-static {p1, p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/l0;->d(I[BILcom/google/android/gms/internal/clearcut/j;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public static g(JJJ)J
    .locals 3

    .line 1
    xor-long/2addr p0, p2

    .line 2
    mul-long/2addr p0, p4

    .line 3
    const/16 v0, 0x2f

    .line 4
    .line 5
    ushr-long v1, p0, v0

    .line 6
    .line 7
    xor-long/2addr p0, v1

    .line 8
    xor-long/2addr p0, p2

    .line 9
    mul-long/2addr p0, p4

    .line 10
    ushr-long p2, p0, v0

    .line 11
    .line 12
    xor-long/2addr p0, p2

    .line 13
    mul-long/2addr p0, p4

    .line 14
    return-wide p0
.end method

.method public static h([B)J
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ltz v1, :cond_7

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v1, v2, :cond_7

    .line 8
    .line 9
    const/16 v2, 0x12

    .line 10
    .line 11
    const/16 v3, 0x1e

    .line 12
    .line 13
    const/16 v4, 0x2b

    .line 14
    .line 15
    const/16 v9, 0x2f

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/16 v10, 0x25

    .line 19
    .line 20
    const/16 v6, 0x20

    .line 21
    .line 22
    const/16 v11, 0x10

    .line 23
    .line 24
    const-wide v12, -0x4b6d499041670d8dL    # -1.9079014105469082E-55

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/16 v14, 0x8

    .line 30
    .line 31
    const-wide v15, -0x651e95c4d06fbfb1L    # -3.35749372464804E-179

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v17, -0x3c5a37a36834ced9L    # -7.8480313857871552E17

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    if-gt v1, v6, :cond_4

    .line 43
    .line 44
    if-gt v1, v11, :cond_3

    .line 45
    .line 46
    if-lt v1, v14, :cond_0

    .line 47
    .line 48
    shl-int/lit8 v2, v1, 0x1

    .line 49
    .line 50
    int-to-long v2, v2

    .line 51
    add-long v21, v2, v15

    .line 52
    .line 53
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    add-long/2addr v2, v15

    .line 58
    sub-int/2addr v1, v14

    .line 59
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-static {v0, v1, v10}, Ljava/lang/Long;->rotateRight(JI)J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    mul-long v4, v4, v21

    .line 68
    .line 69
    add-long v17, v4, v2

    .line 70
    .line 71
    const/16 v4, 0x19

    .line 72
    .line 73
    invoke-static {v2, v3, v4}, Ljava/lang/Long;->rotateRight(JI)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    add-long/2addr v2, v0

    .line 78
    mul-long v19, v2, v21

    .line 79
    .line 80
    invoke-static/range {v17 .. v22}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    return-wide v0

    .line 85
    :cond_0
    const/4 v2, 0x4

    .line 86
    if-lt v1, v2, :cond_1

    .line 87
    .line 88
    shl-int/lit8 v3, v1, 0x1

    .line 89
    .line 90
    int-to-long v3, v3

    .line 91
    add-long v12, v3, v15

    .line 92
    .line 93
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->a(I[B)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    int-to-long v3, v3

    .line 98
    const-wide v5, 0xffffffffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v3, v5

    .line 104
    int-to-long v7, v1

    .line 105
    const/4 v9, 0x3

    .line 106
    shl-long/2addr v3, v9

    .line 107
    add-long v8, v7, v3

    .line 108
    .line 109
    sub-int/2addr v1, v2

    .line 110
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/clearcut/l0;->a(I[B)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    int-to-long v0, v0

    .line 115
    and-long v10, v0, v5

    .line 116
    .line 117
    invoke-static/range {v8 .. v13}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    return-wide v0

    .line 122
    :cond_1
    if-lez v1, :cond_2

    .line 123
    .line 124
    aget-byte v2, v0, v7

    .line 125
    .line 126
    shr-int/lit8 v3, v1, 0x1

    .line 127
    .line 128
    aget-byte v3, v0, v3

    .line 129
    .line 130
    add-int/lit8 v4, v1, -0x1

    .line 131
    .line 132
    aget-byte v0, v0, v4

    .line 133
    .line 134
    and-int/lit16 v2, v2, 0xff

    .line 135
    .line 136
    and-int/lit16 v3, v3, 0xff

    .line 137
    .line 138
    shl-int/2addr v3, v14

    .line 139
    add-int/2addr v2, v3

    .line 140
    and-int/lit16 v0, v0, 0xff

    .line 141
    .line 142
    shl-int/2addr v0, v5

    .line 143
    add-int/2addr v1, v0

    .line 144
    int-to-long v2, v2

    .line 145
    mul-long/2addr v2, v15

    .line 146
    int-to-long v0, v1

    .line 147
    mul-long v0, v0, v17

    .line 148
    .line 149
    xor-long/2addr v0, v2

    .line 150
    ushr-long v2, v0, v9

    .line 151
    .line 152
    xor-long/2addr v0, v2

    .line 153
    mul-long/2addr v0, v15

    .line 154
    return-wide v0

    .line 155
    :cond_2
    return-wide v15

    .line 156
    :cond_3
    shl-int/lit8 v5, v1, 0x1

    .line 157
    .line 158
    int-to-long v5, v5

    .line 159
    add-long v21, v5, v15

    .line 160
    .line 161
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 162
    .line 163
    .line 164
    move-result-wide v5

    .line 165
    mul-long/2addr v5, v12

    .line 166
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 167
    .line 168
    .line 169
    move-result-wide v7

    .line 170
    add-int/lit8 v9, v1, -0x8

    .line 171
    .line 172
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 173
    .line 174
    .line 175
    move-result-wide v9

    .line 176
    mul-long v9, v9, v21

    .line 177
    .line 178
    sub-int/2addr v1, v11

    .line 179
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 180
    .line 181
    .line 182
    move-result-wide v0

    .line 183
    mul-long/2addr v0, v15

    .line 184
    add-long v11, v5, v7

    .line 185
    .line 186
    invoke-static {v11, v12, v4}, Ljava/lang/Long;->rotateRight(JI)J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    invoke-static {v9, v10, v3}, Ljava/lang/Long;->rotateRight(JI)J

    .line 191
    .line 192
    .line 193
    move-result-wide v3

    .line 194
    add-long/2addr v3, v11

    .line 195
    add-long v17, v3, v0

    .line 196
    .line 197
    add-long/2addr v7, v15

    .line 198
    invoke-static {v7, v8, v2}, Ljava/lang/Long;->rotateRight(JI)J

    .line 199
    .line 200
    .line 201
    move-result-wide v0

    .line 202
    add-long/2addr v0, v5

    .line 203
    add-long v19, v0, v9

    .line 204
    .line 205
    invoke-static/range {v17 .. v22}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    return-wide v0

    .line 210
    :cond_4
    const/16 v8, 0x40

    .line 211
    .line 212
    if-gt v1, v8, :cond_5

    .line 213
    .line 214
    shl-int/lit8 v5, v1, 0x1

    .line 215
    .line 216
    int-to-long v5, v5

    .line 217
    add-long v21, v5, v15

    .line 218
    .line 219
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 220
    .line 221
    .line 222
    move-result-wide v5

    .line 223
    mul-long/2addr v5, v15

    .line 224
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 225
    .line 226
    .line 227
    move-result-wide v7

    .line 228
    add-int/lit8 v9, v1, -0x8

    .line 229
    .line 230
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 231
    .line 232
    .line 233
    move-result-wide v9

    .line 234
    mul-long v9, v9, v21

    .line 235
    .line 236
    add-int/lit8 v12, v1, -0x10

    .line 237
    .line 238
    invoke-static {v12, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 239
    .line 240
    .line 241
    move-result-wide v12

    .line 242
    mul-long/2addr v12, v15

    .line 243
    move-wide/from16 v17, v12

    .line 244
    .line 245
    add-long v11, v5, v7

    .line 246
    .line 247
    invoke-static {v11, v12, v4}, Ljava/lang/Long;->rotateRight(JI)J

    .line 248
    .line 249
    .line 250
    move-result-wide v11

    .line 251
    invoke-static {v9, v10, v3}, Ljava/lang/Long;->rotateRight(JI)J

    .line 252
    .line 253
    .line 254
    move-result-wide v19

    .line 255
    add-long v19, v19, v11

    .line 256
    .line 257
    add-long v17, v19, v17

    .line 258
    .line 259
    add-long/2addr v7, v15

    .line 260
    invoke-static {v7, v8, v2}, Ljava/lang/Long;->rotateRight(JI)J

    .line 261
    .line 262
    .line 263
    move-result-wide v7

    .line 264
    add-long/2addr v7, v5

    .line 265
    add-long v19, v7, v9

    .line 266
    .line 267
    invoke-static/range {v17 .. v22}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 268
    .line 269
    .line 270
    move-result-wide v7

    .line 271
    const/16 v14, 0x10

    .line 272
    .line 273
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 274
    .line 275
    .line 276
    move-result-wide v9

    .line 277
    mul-long v9, v9, v21

    .line 278
    .line 279
    const/16 v11, 0x18

    .line 280
    .line 281
    invoke-static {v11, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 282
    .line 283
    .line 284
    move-result-wide v12

    .line 285
    add-int/lit8 v14, v1, -0x20

    .line 286
    .line 287
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 288
    .line 289
    .line 290
    move-result-wide v14

    .line 291
    add-long v14, v14, v17

    .line 292
    .line 293
    mul-long v14, v14, v21

    .line 294
    .line 295
    sub-int/2addr v1, v11

    .line 296
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 297
    .line 298
    .line 299
    move-result-wide v0

    .line 300
    add-long/2addr v0, v7

    .line 301
    mul-long v0, v0, v21

    .line 302
    .line 303
    add-long v7, v9, v12

    .line 304
    .line 305
    invoke-static {v7, v8, v4}, Ljava/lang/Long;->rotateRight(JI)J

    .line 306
    .line 307
    .line 308
    move-result-wide v7

    .line 309
    invoke-static {v14, v15, v3}, Ljava/lang/Long;->rotateRight(JI)J

    .line 310
    .line 311
    .line 312
    move-result-wide v3

    .line 313
    add-long/2addr v3, v7

    .line 314
    add-long v17, v3, v0

    .line 315
    .line 316
    add-long/2addr v12, v5

    .line 317
    invoke-static {v12, v13, v2}, Ljava/lang/Long;->rotateRight(JI)J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    add-long/2addr v0, v9

    .line 322
    add-long v19, v0, v14

    .line 323
    .line 324
    invoke-static/range {v17 .. v22}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 325
    .line 326
    .line 327
    move-result-wide v0

    .line 328
    return-wide v0

    .line 329
    :cond_5
    new-array v6, v5, [J

    .line 330
    .line 331
    new-array v11, v5, [J

    .line 332
    .line 333
    const-wide v2, 0x1529cba0ca458ffL

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 339
    .line 340
    .line 341
    move-result-wide v4

    .line 342
    add-long/2addr v4, v2

    .line 343
    const/4 v14, 0x1

    .line 344
    sub-int/2addr v1, v14

    .line 345
    div-int/lit8 v2, v1, 0x40

    .line 346
    .line 347
    shl-int/lit8 v15, v2, 0x6

    .line 348
    .line 349
    and-int/lit8 v1, v1, 0x3f

    .line 350
    .line 351
    add-int v16, v15, v1

    .line 352
    .line 353
    add-int/lit8 v19, v16, -0x3f

    .line 354
    .line 355
    const-wide v2, 0x226bb95b4e64b6d4L    # 7.104748899679321E-143

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    const-wide v20, 0x134a747f856d0526L    # 9.592726139023731E-216

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    move/from16 v22, v1

    .line 366
    .line 367
    move v1, v7

    .line 368
    :goto_0
    add-long/2addr v4, v2

    .line 369
    aget-wide v23, v6, v7

    .line 370
    .line 371
    add-long v4, v4, v23

    .line 372
    .line 373
    move/from16 v23, v7

    .line 374
    .line 375
    add-int/lit8 v7, v1, 0x8

    .line 376
    .line 377
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 378
    .line 379
    .line 380
    move-result-wide v24

    .line 381
    add-long v4, v24, v4

    .line 382
    .line 383
    invoke-static {v4, v5, v10}, Ljava/lang/Long;->rotateRight(JI)J

    .line 384
    .line 385
    .line 386
    move-result-wide v4

    .line 387
    mul-long/2addr v4, v12

    .line 388
    aget-wide v24, v6, v14

    .line 389
    .line 390
    add-long v2, v2, v24

    .line 391
    .line 392
    add-int/lit8 v7, v1, 0x30

    .line 393
    .line 394
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 395
    .line 396
    .line 397
    move-result-wide v24

    .line 398
    add-long v2, v24, v2

    .line 399
    .line 400
    const/16 v7, 0x2a

    .line 401
    .line 402
    invoke-static {v2, v3, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 403
    .line 404
    .line 405
    move-result-wide v2

    .line 406
    mul-long/2addr v2, v12

    .line 407
    aget-wide v24, v11, v14

    .line 408
    .line 409
    xor-long v24, v4, v24

    .line 410
    .line 411
    aget-wide v4, v6, v23

    .line 412
    .line 413
    move/from16 v26, v8

    .line 414
    .line 415
    add-int/lit8 v8, v1, 0x28

    .line 416
    .line 417
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 418
    .line 419
    .line 420
    move-result-wide v27

    .line 421
    add-long v27, v27, v4

    .line 422
    .line 423
    add-long v27, v27, v2

    .line 424
    .line 425
    aget-wide v2, v11, v23

    .line 426
    .line 427
    add-long v2, v20, v2

    .line 428
    .line 429
    const/16 v8, 0x21

    .line 430
    .line 431
    invoke-static {v2, v3, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 432
    .line 433
    .line 434
    move-result-wide v2

    .line 435
    mul-long v20, v2, v12

    .line 436
    .line 437
    aget-wide v2, v6, v14

    .line 438
    .line 439
    mul-long/2addr v2, v12

    .line 440
    aget-wide v4, v11, v23

    .line 441
    .line 442
    add-long v4, v24, v4

    .line 443
    .line 444
    move/from16 v29, v9

    .line 445
    .line 446
    move/from16 v9, v22

    .line 447
    .line 448
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/clearcut/l0;->l([BIJJ[J)V

    .line 449
    .line 450
    .line 451
    move/from16 v30, v1

    .line 452
    .line 453
    move-object/from16 v22, v6

    .line 454
    .line 455
    add-int/lit8 v1, v30, 0x20

    .line 456
    .line 457
    aget-wide v2, v11, v14

    .line 458
    .line 459
    add-long v2, v20, v2

    .line 460
    .line 461
    add-int/lit8 v4, v30, 0x10

    .line 462
    .line 463
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 464
    .line 465
    .line 466
    move-result-wide v4

    .line 467
    add-long v4, v4, v27

    .line 468
    .line 469
    move-object v6, v11

    .line 470
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/clearcut/l0;->l([BIJJ[J)V

    .line 471
    .line 472
    .line 473
    add-int/lit8 v1, v30, 0x40

    .line 474
    .line 475
    if-ne v1, v15, :cond_6

    .line 476
    .line 477
    const-wide/16 v1, 0xff

    .line 478
    .line 479
    and-long v1, v24, v1

    .line 480
    .line 481
    shl-long/2addr v1, v14

    .line 482
    add-long v34, v1, v12

    .line 483
    .line 484
    aget-wide v1, v11, v23

    .line 485
    .line 486
    int-to-long v3, v9

    .line 487
    add-long/2addr v1, v3

    .line 488
    aput-wide v1, v11, v23

    .line 489
    .line 490
    aget-wide v3, v22, v23

    .line 491
    .line 492
    add-long/2addr v3, v1

    .line 493
    aput-wide v3, v22, v23

    .line 494
    .line 495
    aget-wide v1, v11, v23

    .line 496
    .line 497
    add-long/2addr v1, v3

    .line 498
    aput-wide v1, v11, v23

    .line 499
    .line 500
    add-long v20, v20, v27

    .line 501
    .line 502
    aget-wide v1, v22, v23

    .line 503
    .line 504
    add-long v20, v20, v1

    .line 505
    .line 506
    add-int/lit8 v1, v16, -0x37

    .line 507
    .line 508
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 509
    .line 510
    .line 511
    move-result-wide v1

    .line 512
    add-long v1, v1, v20

    .line 513
    .line 514
    invoke-static {v1, v2, v10}, Ljava/lang/Long;->rotateRight(JI)J

    .line 515
    .line 516
    .line 517
    move-result-wide v1

    .line 518
    mul-long v1, v1, v34

    .line 519
    .line 520
    aget-wide v3, v22, v14

    .line 521
    .line 522
    add-long v27, v27, v3

    .line 523
    .line 524
    add-int/lit8 v3, v16, -0xf

    .line 525
    .line 526
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 527
    .line 528
    .line 529
    move-result-wide v3

    .line 530
    add-long v3, v3, v27

    .line 531
    .line 532
    invoke-static {v3, v4, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 533
    .line 534
    .line 535
    move-result-wide v3

    .line 536
    mul-long v3, v3, v34

    .line 537
    .line 538
    aget-wide v5, v11, v14

    .line 539
    .line 540
    const-wide/16 v9, 0x9

    .line 541
    .line 542
    mul-long/2addr v5, v9

    .line 543
    xor-long v9, v1, v5

    .line 544
    .line 545
    aget-wide v1, v22, v23

    .line 546
    .line 547
    const-wide/16 v5, 0x9

    .line 548
    .line 549
    mul-long/2addr v1, v5

    .line 550
    add-int/lit8 v5, v16, -0x17

    .line 551
    .line 552
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 553
    .line 554
    .line 555
    move-result-wide v5

    .line 556
    add-long/2addr v5, v1

    .line 557
    add-long v12, v5, v3

    .line 558
    .line 559
    aget-wide v1, v11, v23

    .line 560
    .line 561
    add-long v1, v24, v1

    .line 562
    .line 563
    invoke-static {v1, v2, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 564
    .line 565
    .line 566
    move-result-wide v1

    .line 567
    mul-long v7, v1, v34

    .line 568
    .line 569
    aget-wide v1, v22, v14

    .line 570
    .line 571
    mul-long v2, v1, v34

    .line 572
    .line 573
    aget-wide v4, v11, v23

    .line 574
    .line 575
    add-long/2addr v4, v9

    .line 576
    move/from16 v1, v19

    .line 577
    .line 578
    move-object/from16 v6, v22

    .line 579
    .line 580
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/clearcut/l0;->l([BIJJ[J)V

    .line 581
    .line 582
    .line 583
    add-int/lit8 v1, v16, -0x1f

    .line 584
    .line 585
    aget-wide v2, v11, v14

    .line 586
    .line 587
    add-long/2addr v2, v7

    .line 588
    add-int/lit8 v4, v16, -0x2f

    .line 589
    .line 590
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 591
    .line 592
    .line 593
    move-result-wide v4

    .line 594
    add-long/2addr v4, v12

    .line 595
    move-object v6, v11

    .line 596
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/clearcut/l0;->l([BIJJ[J)V

    .line 597
    .line 598
    .line 599
    aget-wide v30, v22, v23

    .line 600
    .line 601
    aget-wide v32, v6, v23

    .line 602
    .line 603
    invoke-static/range {v30 .. v35}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 604
    .line 605
    .line 606
    move-result-wide v0

    .line 607
    ushr-long v2, v12, v29

    .line 608
    .line 609
    xor-long/2addr v2, v12

    .line 610
    mul-long v2, v2, v17

    .line 611
    .line 612
    add-long/2addr v2, v0

    .line 613
    add-long/2addr v2, v9

    .line 614
    aget-wide v30, v22, v14

    .line 615
    .line 616
    aget-wide v32, v6, v14

    .line 617
    .line 618
    invoke-static/range {v30 .. v35}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 619
    .line 620
    .line 621
    move-result-wide v0

    .line 622
    add-long v32, v0, v7

    .line 623
    .line 624
    move-wide/from16 v30, v2

    .line 625
    .line 626
    invoke-static/range {v30 .. v35}, Lcom/google/android/gms/internal/clearcut/l0;->g(JJJ)J

    .line 627
    .line 628
    .line 629
    move-result-wide v0

    .line 630
    return-wide v0

    .line 631
    :cond_6
    move-object/from16 v0, p0

    .line 632
    .line 633
    move-wide/from16 v4, v20

    .line 634
    .line 635
    move-object/from16 v6, v22

    .line 636
    .line 637
    move/from16 v7, v23

    .line 638
    .line 639
    move-wide/from16 v20, v24

    .line 640
    .line 641
    move/from16 v8, v26

    .line 642
    .line 643
    move-wide/from16 v2, v27

    .line 644
    .line 645
    move/from16 v22, v9

    .line 646
    .line 647
    move/from16 v9, v29

    .line 648
    .line 649
    goto/16 :goto_0

    .line 650
    .line 651
    :cond_7
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 652
    .line 653
    new-instance v2, Ljava/lang/StringBuilder;

    .line 654
    .line 655
    const/16 v3, 0x43

    .line 656
    .line 657
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 658
    .line 659
    .line 660
    const-string v3, "Out of bound index with offput: 0 and length: "

    .line 661
    .line 662
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    throw v0
.end method

.method public static i(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/StringBuilder;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v5, Ljava/util/TreeSet;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/util/TreeSet;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    array-length v7, v6

    .line 31
    const/4 v8, 0x0

    .line 32
    move v9, v8

    .line 33
    :goto_0
    const-string v10, "get"

    .line 34
    .line 35
    if-ge v9, v7, :cond_1

    .line 36
    .line 37
    aget-object v11, v6, v9

    .line 38
    .line 39
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    invoke-virtual {v4, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    array-length v12, v12

    .line 51
    if-nez v12, :cond_0

    .line 52
    .line 53
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    invoke-virtual {v3, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-virtual {v12, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-eqz v10, :cond_0

    .line 69
    .line 70
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v5, v10}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v5}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_17

    .line 89
    .line 90
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Ljava/lang/String;

    .line 95
    .line 96
    const-string v7, ""

    .line 97
    .line 98
    invoke-virtual {v6, v10, v7}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    const-string v11, "List"

    .line 103
    .line 104
    invoke-virtual {v9, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    const/4 v13, 0x1

    .line 109
    if-eqz v12, :cond_4

    .line 110
    .line 111
    const-string v12, "OrBuilderList"

    .line 112
    .line 113
    invoke-virtual {v9, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-nez v12, :cond_4

    .line 118
    .line 119
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-nez v11, :cond_4

    .line 124
    .line 125
    invoke-virtual {v9, v8, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    add-int/lit8 v12, v12, -0x4

    .line 142
    .line 143
    invoke-virtual {v9, v13, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_3

    .line 156
    .line 157
    invoke-virtual {v11, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    goto :goto_2

    .line 162
    :cond_3
    new-instance v12, Ljava/lang/String;

    .line 163
    .line 164
    invoke-direct {v12, v11}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move-object v11, v12

    .line 168
    :goto_2
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    check-cast v12, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    if-eqz v12, :cond_4

    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    const-class v15, Ljava/util/List;

    .line 181
    .line 182
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    if-eqz v14, :cond_4

    .line 187
    .line 188
    invoke-static {v11}, Lcom/google/android/gms/internal/clearcut/l0;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    new-array v7, v8, [Ljava/lang/Object;

    .line 193
    .line 194
    invoke-static {v12, v0, v7}, Lcom/google/android/gms/internal/clearcut/x;->b(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/clearcut/x;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-static {v1, v2, v6, v7}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_4
    const-string v11, "Map"

    .line 203
    .line 204
    invoke-virtual {v9, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-eqz v12, :cond_6

    .line 209
    .line 210
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-nez v11, :cond_6

    .line 215
    .line 216
    invoke-virtual {v9, v8, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    add-int/lit8 v12, v12, -0x3

    .line 233
    .line 234
    invoke-virtual {v9, v13, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-eqz v14, :cond_5

    .line 247
    .line 248
    invoke-virtual {v11, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    goto :goto_3

    .line 253
    :cond_5
    new-instance v12, Ljava/lang/String;

    .line 254
    .line 255
    invoke-direct {v12, v11}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    move-object v11, v12

    .line 259
    :goto_3
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    check-cast v6, Ljava/lang/reflect/Method;

    .line 264
    .line 265
    if-eqz v6, :cond_6

    .line 266
    .line 267
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    const-class v14, Ljava/util/Map;

    .line 272
    .line 273
    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    if-eqz v12, :cond_6

    .line 278
    .line 279
    const-class v12, Ljava/lang/Deprecated;

    .line 280
    .line 281
    invoke-virtual {v6, v12}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-nez v12, :cond_6

    .line 286
    .line 287
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    if-eqz v12, :cond_6

    .line 296
    .line 297
    invoke-static {v11}, Lcom/google/android/gms/internal/clearcut/l0;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    new-array v9, v8, [Ljava/lang/Object;

    .line 302
    .line 303
    invoke-static {v6, v0, v9}, Lcom/google/android/gms/internal/clearcut/x;->b(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/clearcut/x;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-static {v1, v2, v7, v6}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_6
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    const-string v11, "set"

    .line 317
    .line 318
    if-eqz v6, :cond_7

    .line 319
    .line 320
    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    goto :goto_4

    .line 325
    :cond_7
    new-instance v6, Ljava/lang/String;

    .line 326
    .line 327
    invoke-direct {v6, v11}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    :goto_4
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    check-cast v6, Ljava/lang/reflect/Method;

    .line 335
    .line 336
    if-eqz v6, :cond_2

    .line 337
    .line 338
    const-string v6, "Bytes"

    .line 339
    .line 340
    invoke-virtual {v9, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    if-eqz v6, :cond_9

    .line 345
    .line 346
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    add-int/lit8 v6, v6, -0x5

    .line 351
    .line 352
    invoke-virtual {v9, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    if-eqz v11, :cond_8

    .line 365
    .line 366
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    goto :goto_5

    .line 371
    :cond_8
    new-instance v6, Ljava/lang/String;

    .line 372
    .line 373
    invoke-direct {v6, v10}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    :goto_5
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    if-nez v6, :cond_2

    .line 381
    .line 382
    :cond_9
    invoke-virtual {v9, v8, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    if-eqz v12, :cond_a

    .line 407
    .line 408
    invoke-virtual {v6, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    goto :goto_6

    .line 413
    :cond_a
    new-instance v11, Ljava/lang/String;

    .line 414
    .line 415
    invoke-direct {v11, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    move-object v6, v11

    .line 419
    :goto_6
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 420
    .line 421
    .line 422
    move-result v11

    .line 423
    if-eqz v11, :cond_b

    .line 424
    .line 425
    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v11

    .line 429
    goto :goto_7

    .line 430
    :cond_b
    new-instance v11, Ljava/lang/String;

    .line 431
    .line 432
    invoke-direct {v11, v10}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    :goto_7
    invoke-virtual {v3, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v11

    .line 439
    check-cast v11, Ljava/lang/reflect/Method;

    .line 440
    .line 441
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    const-string v14, "has"

    .line 446
    .line 447
    if-eqz v12, :cond_c

    .line 448
    .line 449
    invoke-virtual {v14, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    goto :goto_8

    .line 454
    :cond_c
    new-instance v9, Ljava/lang/String;

    .line 455
    .line 456
    invoke-direct {v9, v14}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    :goto_8
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    check-cast v9, Ljava/lang/reflect/Method;

    .line 464
    .line 465
    if-eqz v11, :cond_2

    .line 466
    .line 467
    new-array v12, v8, [Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {v11, v0, v12}, Lcom/google/android/gms/internal/clearcut/x;->b(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/clearcut/x;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v11

    .line 473
    if-nez v9, :cond_16

    .line 474
    .line 475
    instance-of v9, v11, Ljava/lang/Boolean;

    .line 476
    .line 477
    if-eqz v9, :cond_e

    .line 478
    .line 479
    move-object v7, v11

    .line 480
    check-cast v7, Ljava/lang/Boolean;

    .line 481
    .line 482
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    if-nez v7, :cond_d

    .line 487
    .line 488
    :goto_9
    move v7, v13

    .line 489
    goto/16 :goto_b

    .line 490
    .line 491
    :cond_d
    move v7, v8

    .line 492
    goto :goto_b

    .line 493
    :cond_e
    instance-of v9, v11, Ljava/lang/Integer;

    .line 494
    .line 495
    if-eqz v9, :cond_f

    .line 496
    .line 497
    move-object v7, v11

    .line 498
    check-cast v7, Ljava/lang/Integer;

    .line 499
    .line 500
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v7

    .line 504
    if-nez v7, :cond_d

    .line 505
    .line 506
    goto :goto_9

    .line 507
    :cond_f
    instance-of v9, v11, Ljava/lang/Float;

    .line 508
    .line 509
    if-eqz v9, :cond_10

    .line 510
    .line 511
    move-object v7, v11

    .line 512
    check-cast v7, Ljava/lang/Float;

    .line 513
    .line 514
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    const/4 v9, 0x0

    .line 519
    cmpl-float v7, v7, v9

    .line 520
    .line 521
    if-nez v7, :cond_d

    .line 522
    .line 523
    goto :goto_9

    .line 524
    :cond_10
    instance-of v9, v11, Ljava/lang/Double;

    .line 525
    .line 526
    if-eqz v9, :cond_11

    .line 527
    .line 528
    move-object v7, v11

    .line 529
    check-cast v7, Ljava/lang/Double;

    .line 530
    .line 531
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 532
    .line 533
    .line 534
    move-result-wide v14

    .line 535
    const-wide/16 v16, 0x0

    .line 536
    .line 537
    cmpl-double v7, v14, v16

    .line 538
    .line 539
    if-nez v7, :cond_d

    .line 540
    .line 541
    goto :goto_9

    .line 542
    :cond_11
    instance-of v9, v11, Ljava/lang/String;

    .line 543
    .line 544
    if-eqz v9, :cond_12

    .line 545
    .line 546
    :goto_a
    invoke-virtual {v11, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    goto :goto_b

    .line 551
    :cond_12
    instance-of v7, v11, Lcom/google/android/gms/internal/clearcut/m;

    .line 552
    .line 553
    if-eqz v7, :cond_13

    .line 554
    .line 555
    sget-object v7, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    .line 556
    .line 557
    goto :goto_a

    .line 558
    :cond_13
    instance-of v7, v11, Lcom/google/android/gms/internal/clearcut/g;

    .line 559
    .line 560
    if-eqz v7, :cond_14

    .line 561
    .line 562
    move-object v7, v11

    .line 563
    check-cast v7, Lcom/google/android/gms/internal/clearcut/g;

    .line 564
    .line 565
    check-cast v7, Lcom/google/android/gms/internal/clearcut/x;

    .line 566
    .line 567
    const/4 v9, 0x6

    .line 568
    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/clearcut/x;->a(I)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    check-cast v7, Lcom/google/android/gms/internal/clearcut/x;

    .line 573
    .line 574
    if-ne v11, v7, :cond_d

    .line 575
    .line 576
    goto :goto_9

    .line 577
    :cond_14
    instance-of v7, v11, Ljava/lang/Enum;

    .line 578
    .line 579
    if-eqz v7, :cond_d

    .line 580
    .line 581
    move-object v7, v11

    .line 582
    check-cast v7, Ljava/lang/Enum;

    .line 583
    .line 584
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 585
    .line 586
    .line 587
    move-result v7

    .line 588
    if-nez v7, :cond_d

    .line 589
    .line 590
    goto :goto_9

    .line 591
    :goto_b
    if-nez v7, :cond_15

    .line 592
    .line 593
    goto :goto_c

    .line 594
    :cond_15
    move v13, v8

    .line 595
    goto :goto_c

    .line 596
    :cond_16
    new-array v7, v8, [Ljava/lang/Object;

    .line 597
    .line 598
    invoke-static {v9, v0, v7}, Lcom/google/android/gms/internal/clearcut/x;->b(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/clearcut/x;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    check-cast v7, Ljava/lang/Boolean;

    .line 603
    .line 604
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 605
    .line 606
    .line 607
    move-result v13

    .line 608
    :goto_c
    if-eqz v13, :cond_2

    .line 609
    .line 610
    invoke-static {v6}, Lcom/google/android/gms/internal/clearcut/l0;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    invoke-static {v1, v2, v6, v11}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_1

    .line 618
    .line 619
    :cond_17
    iget-object v0, v0, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 620
    .line 621
    if-eqz v0, :cond_18

    .line 622
    .line 623
    :goto_d
    iget v3, v0, Lcom/google/android/gms/internal/clearcut/b0;->a:I

    .line 624
    .line 625
    if-ge v8, v3, :cond_18

    .line 626
    .line 627
    iget-object v3, v0, Lcom/google/android/gms/internal/clearcut/b0;->b:[I

    .line 628
    .line 629
    aget v3, v3, v8

    .line 630
    .line 631
    ushr-int/lit8 v3, v3, 0x3

    .line 632
    .line 633
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    iget-object v4, v0, Lcom/google/android/gms/internal/clearcut/b0;->c:[Ljava/lang/Object;

    .line 638
    .line 639
    aget-object v4, v4, v8

    .line 640
    .line 641
    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    add-int/lit8 v8, v8, 0x1

    .line 645
    .line 646
    goto :goto_d

    .line 647
    :cond_18
    return-void
.end method

.method public static j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)V
    .locals 11

    .line 1
    if-eqz p1, :cond_13

    .line 2
    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/clearcut/n0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lcom/google/android/gms/internal/clearcut/l0;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 22
    .line 23
    .line 24
    const-string v2, " <\n"

    .line 25
    .line 26
    invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 27
    .line 28
    .line 29
    const-string v2, "  "

    .line 30
    .line 31
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    array-length v4, v3

    .line 43
    move v5, v1

    .line 44
    :goto_0
    if-ge v5, v4, :cond_4

    .line 45
    .line 46
    aget-object v6, v3, v5

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string v9, "cachedSize"

    .line 57
    .line 58
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-nez v9, :cond_3

    .line 63
    .line 64
    and-int/lit8 v9, v7, 0x1

    .line 65
    .line 66
    const/4 v10, 0x1

    .line 67
    if-ne v9, v10, :cond_3

    .line 68
    .line 69
    and-int/lit8 v7, v7, 0x8

    .line 70
    .line 71
    const/16 v9, 0x8

    .line 72
    .line 73
    if-eq v7, v9, :cond_3

    .line 74
    .line 75
    const-string v7, "_"

    .line 76
    .line 77
    invoke-virtual {v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-nez v9, :cond_3

    .line 82
    .line 83
    invoke-virtual {v8, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-nez v7, :cond_3

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_2

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    if-eq v7, v9, :cond_2

    .line 110
    .line 111
    if-nez v6, :cond_1

    .line 112
    .line 113
    move v7, v1

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    :goto_1
    move v9, v1

    .line 120
    :goto_2
    if-ge v9, v7, :cond_3

    .line 121
    .line 122
    invoke-static {v6, v9}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-static {v8, v10, p2, p3}, Lcom/google/android/gms/internal/clearcut/l0;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    invoke-static {v8, v6, p2, p3}, Lcom/google/android/gms/internal/clearcut/l0;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    array-length v4, v3

    .line 143
    :goto_3
    if-ge v1, v4, :cond_8

    .line 144
    .line 145
    aget-object v5, v3, v1

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const-string v6, "set"

    .line 152
    .line 153
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_7

    .line 158
    .line 159
    const/4 v6, 0x3

    .line 160
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    :try_start_0
    const-string v6, "has"

    .line 165
    .line 166
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eqz v8, :cond_5

    .line 175
    .line 176
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    goto :goto_4

    .line 181
    :cond_5
    new-instance v7, Ljava/lang/String;

    .line 182
    .line 183
    invoke-direct {v7, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    move-object v6, v7

    .line 187
    :goto_4
    const/4 v7, 0x0

    .line 188
    invoke-virtual {v2, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 189
    .line 190
    .line 191
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    invoke-virtual {v6, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    check-cast v6, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-eqz v6, :cond_7

    .line 203
    .line 204
    :try_start_1
    const-string v6, "get"

    .line 205
    .line 206
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-eqz v9, :cond_6

    .line 215
    .line 216
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    goto :goto_5

    .line 221
    :cond_6
    new-instance v8, Ljava/lang/String;

    .line 222
    .line 223
    invoke-direct {v8, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    move-object v6, v8

    .line 227
    :goto_5
    invoke-virtual {v2, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 228
    .line 229
    .line 230
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 231
    invoke-virtual {v6, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-static {v5, v6, p2, p3}, Lcom/google/android/gms/internal/clearcut/l0;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)V

    .line 236
    .line 237
    .line 238
    :catch_0
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_8
    if-eqz p0, :cond_13

    .line 242
    .line 243
    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 247
    .line 248
    .line 249
    const-string p0, ">\n"

    .line 250
    .line 251
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 252
    .line 253
    .line 254
    goto/16 :goto_d

    .line 255
    .line 256
    :cond_9
    invoke-static {p0}, Lcom/google/android/gms/internal/clearcut/l0;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 264
    .line 265
    .line 266
    const-string p0, ": "

    .line 267
    .line 268
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 269
    .line 270
    .line 271
    instance-of p0, p1, Ljava/lang/String;

    .line 272
    .line 273
    const/16 p2, 0x20

    .line 274
    .line 275
    const/16 v0, 0x22

    .line 276
    .line 277
    if-eqz p0, :cond_d

    .line 278
    .line 279
    check-cast p1, Ljava/lang/String;

    .line 280
    .line 281
    const-string p0, "http"

    .line 282
    .line 283
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    if-nez p0, :cond_a

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    const/16 v2, 0xc8

    .line 294
    .line 295
    if-le p0, v2, :cond_a

    .line 296
    .line 297
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    const-string p1, "[...]"

    .line 306
    .line 307
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    :cond_a
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    new-instance v2, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 318
    .line 319
    .line 320
    :goto_6
    if-ge v1, p0, :cond_c

    .line 321
    .line 322
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-lt v3, p2, :cond_b

    .line 327
    .line 328
    const/16 v4, 0x7e

    .line 329
    .line 330
    if-gt v3, v4, :cond_b

    .line 331
    .line 332
    if-eq v3, v0, :cond_b

    .line 333
    .line 334
    const/16 v4, 0x27

    .line 335
    .line 336
    if-eq v3, v4, :cond_b

    .line 337
    .line 338
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    const-string v4, "\\u%04x"

    .line 351
    .line 352
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_c
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    const-string p1, "\""

    .line 367
    .line 368
    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 372
    .line 373
    .line 374
    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 375
    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_d
    instance-of p0, p1, [B

    .line 379
    .line 380
    if-eqz p0, :cond_12

    .line 381
    .line 382
    check-cast p1, [B

    .line 383
    .line 384
    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 385
    .line 386
    .line 387
    :goto_8
    array-length p0, p1

    .line 388
    if-ge v1, p0, :cond_11

    .line 389
    .line 390
    aget-byte p0, p1, v1

    .line 391
    .line 392
    and-int/lit16 p0, p0, 0xff

    .line 393
    .line 394
    const/16 v2, 0x5c

    .line 395
    .line 396
    if-eq p0, v2, :cond_10

    .line 397
    .line 398
    if-ne p0, v0, :cond_e

    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_e
    if-lt p0, p2, :cond_f

    .line 402
    .line 403
    const/16 v2, 0x7f

    .line 404
    .line 405
    if-ge p0, v2, :cond_f

    .line 406
    .line 407
    :goto_9
    int-to-char p0, p0

    .line 408
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 409
    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_f
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    const-string v2, "\\%03o"

    .line 421
    .line 422
    invoke-static {v2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 427
    .line 428
    .line 429
    goto :goto_b

    .line 430
    :cond_10
    :goto_a
    invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 431
    .line 432
    .line 433
    goto :goto_9

    .line 434
    :goto_b
    add-int/lit8 v1, v1, 0x1

    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_11
    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 438
    .line 439
    .line 440
    goto :goto_c

    .line 441
    :cond_12
    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 442
    .line 443
    .line 444
    :goto_c
    const-string p0, "\n"

    .line 445
    .line 446
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 447
    .line 448
    .line 449
    :cond_13
    :goto_d
    return-void
.end method

.method public static final k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 6

    .line 1
    instance-of v0, p3, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v0, p3, Ljava/util/Map;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p3, Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-void

    .line 56
    :cond_2
    const/16 v0, 0xa

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    move v1, v0

    .line 63
    :goto_2
    const/16 v2, 0x20

    .line 64
    .line 65
    if-ge v1, p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    instance-of p2, p3, Ljava/lang/String;

    .line 77
    .line 78
    const/16 v1, 0x22

    .line 79
    .line 80
    const-string v3, ": \""

    .line 81
    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    check-cast p3, Ljava/lang/String;

    .line 88
    .line 89
    sget-object p1, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    .line 90
    .line 91
    new-instance p1, Lcom/google/android/gms/internal/clearcut/m;

    .line 92
    .line 93
    sget-object p2, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    invoke-virtual {p3, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/clearcut/m;-><init>([B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lcom/google/android/gms/internal/clearcut/l0;->p(Lcom/google/android/gms/internal/clearcut/m;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    instance-of p2, p3, Lcom/google/android/gms/internal/clearcut/m;

    .line 114
    .line 115
    if-eqz p2, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    check-cast p3, Lcom/google/android/gms/internal/clearcut/m;

    .line 121
    .line 122
    invoke-static {p3}, Lcom/google/android/gms/internal/clearcut/l0;->p(Lcom/google/android/gms/internal/clearcut/m;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_5
    instance-of p2, p3, Lcom/google/android/gms/internal/clearcut/x;

    .line 134
    .line 135
    const-string v1, "}"

    .line 136
    .line 137
    const-string v3, "\n"

    .line 138
    .line 139
    const-string v4, " {"

    .line 140
    .line 141
    if-eqz p2, :cond_7

    .line 142
    .line 143
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    check-cast p3, Lcom/google/android/gms/internal/clearcut/x;

    .line 147
    .line 148
    add-int/lit8 p2, p1, 0x2

    .line 149
    .line 150
    invoke-static {p3, p0, p2}, Lcom/google/android/gms/internal/clearcut/l0;->i(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/StringBuilder;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    :goto_3
    if-ge v0, p1, :cond_6

    .line 157
    .line 158
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    add-int/lit8 v0, v0, 0x1

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_7
    instance-of p2, p3, Ljava/util/Map$Entry;

    .line 169
    .line 170
    if-eqz p2, :cond_9

    .line 171
    .line 172
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    check-cast p3, Ljava/util/Map$Entry;

    .line 176
    .line 177
    add-int/lit8 p2, p1, 0x2

    .line 178
    .line 179
    const-string v4, "key"

    .line 180
    .line 181
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-static {p0, p2, v4, v5}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    const-string v4, "value"

    .line 189
    .line 190
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    invoke-static {p0, p2, v4, p3}, Lcom/google/android/gms/internal/clearcut/l0;->k(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    :goto_4
    if-ge v0, p1, :cond_8

    .line 201
    .line 202
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    add-int/lit8 v0, v0, 0x1

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_8
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_9
    const-string p1, ": "

    .line 213
    .line 214
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method public static l([BIJJ[J)V
    .locals 6

    .line 1
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-int/lit8 v2, p1, 0x8

    .line 6
    .line 7
    invoke-static {v2, p0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    add-int/lit8 v4, p1, 0x10

    .line 12
    .line 13
    invoke-static {v4, p0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    add-int/lit8 p1, p1, 0x18

    .line 18
    .line 19
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/clearcut/l0;->n(I[B)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    add-long/2addr p2, v0

    .line 24
    add-long/2addr p4, p2

    .line 25
    add-long/2addr p4, p0

    .line 26
    const/16 v0, 0x15

    .line 27
    .line 28
    invoke-static {p4, p5, v0}, Ljava/lang/Long;->rotateRight(JI)J

    .line 29
    .line 30
    .line 31
    move-result-wide p4

    .line 32
    add-long/2addr v2, p2

    .line 33
    add-long/2addr v2, v4

    .line 34
    const/16 v0, 0x2c

    .line 35
    .line 36
    invoke-static {v2, v3, v0}, Ljava/lang/Long;->rotateRight(JI)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    add-long/2addr v0, p4

    .line 41
    const/4 p4, 0x0

    .line 42
    add-long/2addr v2, p0

    .line 43
    aput-wide v2, p6, p4

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    add-long/2addr v0, p2

    .line 47
    aput-wide v0, p6, p0

    .line 48
    .line 49
    return-void
.end method

.method public static m([BILcom/google/android/gms/internal/clearcut/j;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    aget-byte v1, p0, p1

    .line 4
    .line 5
    int-to-long v1, v1

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    cmp-long v3, v1, v3

    .line 9
    .line 10
    if-ltz v3, :cond_0

    .line 11
    .line 12
    iput-wide v1, p2, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    const-wide/16 v3, 0x7f

    .line 16
    .line 17
    and-long/2addr v1, v3

    .line 18
    add-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    aget-byte v0, p0, v0

    .line 21
    .line 22
    and-int/lit8 v3, v0, 0x7f

    .line 23
    .line 24
    int-to-long v3, v3

    .line 25
    const/4 v5, 0x7

    .line 26
    shl-long/2addr v3, v5

    .line 27
    or-long/2addr v1, v3

    .line 28
    move v3, v5

    .line 29
    :goto_0
    if-gez v0, :cond_1

    .line 30
    .line 31
    add-int/lit8 v0, p1, 0x1

    .line 32
    .line 33
    aget-byte p1, p0, p1

    .line 34
    .line 35
    add-int/2addr v3, v5

    .line 36
    and-int/lit8 v4, p1, 0x7f

    .line 37
    .line 38
    int-to-long v6, v4

    .line 39
    shl-long/2addr v6, v3

    .line 40
    or-long/2addr v1, v6

    .line 41
    move v8, v0

    .line 42
    move v0, p1

    .line 43
    move p1, v8

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-wide v1, p2, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 46
    .line 47
    return p1
.end method

.method public static n(I[B)J
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {p1, p0, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    return-wide p0
.end method

.method public static o(I[B)I
    .locals 2

    .line 1
    aget-byte v0, p1, p0

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 v1, p0, 0x1

    .line 6
    .line 7
    aget-byte v1, p1, v1

    .line 8
    .line 9
    and-int/lit16 v1, v1, 0xff

    .line 10
    .line 11
    shl-int/lit8 v1, v1, 0x8

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    add-int/lit8 v1, p0, 0x2

    .line 15
    .line 16
    aget-byte v1, p1, v1

    .line 17
    .line 18
    and-int/lit16 v1, v1, 0xff

    .line 19
    .line 20
    shl-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    add-int/lit8 p0, p0, 0x3

    .line 24
    .line 25
    aget-byte p0, p1, p0

    .line 26
    .line 27
    and-int/lit16 p0, p0, 0xff

    .line 28
    .line 29
    shl-int/lit8 p0, p0, 0x18

    .line 30
    .line 31
    or-int/2addr p0, v0

    .line 32
    return p0
.end method

.method public static p(Lcom/google/android/gms/internal/clearcut/m;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/clearcut/m;->h(I)B

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x22

    .line 22
    .line 23
    if-eq v2, v3, :cond_3

    .line 24
    .line 25
    const/16 v3, 0x27

    .line 26
    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x5c

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    if-lt v2, v4, :cond_0

    .line 39
    .line 40
    const/16 v4, 0x7e

    .line 41
    .line 42
    if-gt v2, v4, :cond_0

    .line 43
    .line 44
    :goto_1
    int-to-char v2, v2

    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    ushr-int/lit8 v3, v2, 0x6

    .line 53
    .line 54
    and-int/lit8 v3, v3, 0x3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x30

    .line 57
    .line 58
    int-to-char v3, v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    ushr-int/lit8 v3, v2, 0x3

    .line 63
    .line 64
    and-int/lit8 v3, v3, 0x7

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x30

    .line 67
    .line 68
    int-to-char v3, v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    and-int/lit8 v2, v2, 0x7

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x30

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_0
    const-string v2, "\\r"

    .line 78
    .line 79
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :pswitch_1
    const-string v2, "\\f"

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :pswitch_2
    const-string v2, "\\v"

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :pswitch_3
    const-string v2, "\\n"

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :pswitch_4
    const-string v2, "\\t"

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :pswitch_5
    const-string v2, "\\b"

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :pswitch_6
    const-string v2, "\\a"

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    const-string v2, "\\\\"

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    const-string v2, "\\\'"

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    const-string v2, "\\\""

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q([BILcom/google/android/gms/internal/clearcut/j;)I
    .locals 4

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p2, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    iput-object p0, p2, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    add-int v1, p1, v0

    .line 15
    .line 16
    sget-object v2, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    .line 17
    .line 18
    invoke-virtual {v2, p0, p1, v1}, Lcom/google/android/gms/internal/clearcut/l0;->t([BII)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    new-instance v2, Ljava/lang/String;

    .line 25
    .line 26
    sget-object v3, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 29
    .line 30
    .line 31
    iput-object v2, p2, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/clearcut/B;

    .line 35
    .line 36
    const-string p1, "Protocol message had invalid UTF-8."

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method public static r(I[B)J
    .locals 7

    .line 1
    aget-byte v0, p1, p0

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-wide/16 v2, 0xff

    .line 5
    .line 6
    and-long/2addr v0, v2

    .line 7
    add-int/lit8 v4, p0, 0x1

    .line 8
    .line 9
    aget-byte v4, p1, v4

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    and-long/2addr v4, v2

    .line 13
    const/16 v6, 0x8

    .line 14
    .line 15
    shl-long/2addr v4, v6

    .line 16
    or-long/2addr v0, v4

    .line 17
    add-int/lit8 v4, p0, 0x2

    .line 18
    .line 19
    aget-byte v4, p1, v4

    .line 20
    .line 21
    int-to-long v4, v4

    .line 22
    and-long/2addr v4, v2

    .line 23
    const/16 v6, 0x10

    .line 24
    .line 25
    shl-long/2addr v4, v6

    .line 26
    or-long/2addr v0, v4

    .line 27
    add-int/lit8 v4, p0, 0x3

    .line 28
    .line 29
    aget-byte v4, p1, v4

    .line 30
    .line 31
    int-to-long v4, v4

    .line 32
    and-long/2addr v4, v2

    .line 33
    const/16 v6, 0x18

    .line 34
    .line 35
    shl-long/2addr v4, v6

    .line 36
    or-long/2addr v0, v4

    .line 37
    add-int/lit8 v4, p0, 0x4

    .line 38
    .line 39
    aget-byte v4, p1, v4

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    and-long/2addr v4, v2

    .line 43
    const/16 v6, 0x20

    .line 44
    .line 45
    shl-long/2addr v4, v6

    .line 46
    or-long/2addr v0, v4

    .line 47
    add-int/lit8 v4, p0, 0x5

    .line 48
    .line 49
    aget-byte v4, p1, v4

    .line 50
    .line 51
    int-to-long v4, v4

    .line 52
    and-long/2addr v4, v2

    .line 53
    const/16 v6, 0x28

    .line 54
    .line 55
    shl-long/2addr v4, v6

    .line 56
    or-long/2addr v0, v4

    .line 57
    add-int/lit8 v4, p0, 0x6

    .line 58
    .line 59
    aget-byte v4, p1, v4

    .line 60
    .line 61
    int-to-long v4, v4

    .line 62
    and-long/2addr v4, v2

    .line 63
    const/16 v6, 0x30

    .line 64
    .line 65
    shl-long/2addr v4, v6

    .line 66
    or-long/2addr v0, v4

    .line 67
    add-int/lit8 p0, p0, 0x7

    .line 68
    .line 69
    aget-byte p0, p1, p0

    .line 70
    .line 71
    int-to-long p0, p0

    .line 72
    and-long/2addr p0, v2

    .line 73
    const/16 v2, 0x38

    .line 74
    .line 75
    shl-long/2addr p0, v2

    .line 76
    or-long/2addr p0, v0

    .line 77
    return-wide p0
.end method

.method public static s([BILcom/google/android/gms/internal/clearcut/j;)I
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p2, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    .line 10
    .line 11
    iput-object p0, p2, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/clearcut/m;->g([BII)Lcom/google/android/gms/internal/clearcut/m;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iput-object p0, p2, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    return p1
.end method

.method public static final u(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const-string v3, "_"

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static v(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    :goto_1
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/16 v3, 0x5f

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method


# virtual methods
.method public t([BII)Z
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget v4, v2, Lcom/google/android/gms/internal/clearcut/l0;->a:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    or-int v4, v1, v3

    .line 15
    .line 16
    array-length v5, v0

    .line 17
    sub-int/2addr v5, v3

    .line 18
    or-int/2addr v4, v5

    .line 19
    if-ltz v4, :cond_10

    .line 20
    .line 21
    int-to-long v4, v1

    .line 22
    int-to-long v6, v3

    .line 23
    sub-long/2addr v6, v4

    .line 24
    long-to-int v1, v6

    .line 25
    const/16 v3, 0x10

    .line 26
    .line 27
    const-wide/16 v7, 0x1

    .line 28
    .line 29
    if-ge v1, v3, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-wide v9, v4

    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-ge v3, v1, :cond_2

    .line 36
    .line 37
    add-long v11, v9, v7

    .line 38
    .line 39
    invoke-static {v0, v9, v10}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-gez v9, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    move-wide v9, v11

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v3, v1

    .line 51
    :goto_1
    sub-int/2addr v1, v3

    .line 52
    int-to-long v9, v3

    .line 53
    add-long/2addr v4, v9

    .line 54
    :goto_2
    const/4 v3, 0x0

    .line 55
    :goto_3
    if-lez v1, :cond_4

    .line 56
    .line 57
    add-long v9, v4, v7

    .line 58
    .line 59
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ltz v3, :cond_3

    .line 64
    .line 65
    add-int/lit8 v1, v1, -0x1

    .line 66
    .line 67
    move-wide v4, v9

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    move-wide v4, v9

    .line 70
    :cond_4
    if-nez v1, :cond_5

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    goto/16 :goto_d

    .line 74
    .line 75
    :cond_5
    add-int/lit8 v9, v1, -0x1

    .line 76
    .line 77
    const/16 v10, -0x20

    .line 78
    .line 79
    const/16 v11, -0x41

    .line 80
    .line 81
    if-ge v3, v10, :cond_8

    .line 82
    .line 83
    if-nez v9, :cond_6

    .line 84
    .line 85
    move v6, v3

    .line 86
    goto/16 :goto_d

    .line 87
    .line 88
    :cond_6
    add-int/lit8 v1, v1, -0x2

    .line 89
    .line 90
    const/16 v9, -0x3e

    .line 91
    .line 92
    if-lt v3, v9, :cond_f

    .line 93
    .line 94
    add-long v9, v4, v7

    .line 95
    .line 96
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-le v3, v11, :cond_7

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_7
    move-wide v15, v7

    .line 104
    move-wide v4, v9

    .line 105
    goto :goto_5

    .line 106
    :cond_8
    const/16 v12, -0x10

    .line 107
    .line 108
    const-wide/16 v13, 0x2

    .line 109
    .line 110
    if-ge v3, v12, :cond_d

    .line 111
    .line 112
    const/4 v12, 0x2

    .line 113
    if-ge v9, v12, :cond_9

    .line 114
    .line 115
    :goto_4
    invoke-static {v4, v5, v0, v3, v9}, Lcom/google/android/gms/internal/clearcut/l0;->e(J[BII)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    goto/16 :goto_d

    .line 120
    .line 121
    :cond_9
    add-int/lit8 v1, v1, -0x3

    .line 122
    .line 123
    move-wide v15, v7

    .line 124
    add-long v6, v4, v15

    .line 125
    .line 126
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-gt v8, v11, :cond_f

    .line 131
    .line 132
    const/16 v9, -0x60

    .line 133
    .line 134
    if-ne v3, v10, :cond_a

    .line 135
    .line 136
    if-lt v8, v9, :cond_f

    .line 137
    .line 138
    :cond_a
    const/16 v10, -0x13

    .line 139
    .line 140
    if-ne v3, v10, :cond_b

    .line 141
    .line 142
    if-ge v8, v9, :cond_f

    .line 143
    .line 144
    :cond_b
    add-long/2addr v4, v13

    .line 145
    invoke-static {v0, v6, v7}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-le v3, v11, :cond_c

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_c
    :goto_5
    move-wide v7, v15

    .line 153
    goto :goto_2

    .line 154
    :cond_d
    move-wide v15, v7

    .line 155
    const/4 v6, 0x3

    .line 156
    if-ge v9, v6, :cond_e

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_e
    add-int/lit8 v1, v1, -0x4

    .line 160
    .line 161
    add-long v7, v4, v15

    .line 162
    .line 163
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-gt v6, v11, :cond_f

    .line 168
    .line 169
    shl-int/lit8 v3, v3, 0x1c

    .line 170
    .line 171
    add-int/lit8 v6, v6, 0x70

    .line 172
    .line 173
    add-int/2addr v6, v3

    .line 174
    shr-int/lit8 v3, v6, 0x1e

    .line 175
    .line 176
    if-nez v3, :cond_f

    .line 177
    .line 178
    add-long/2addr v13, v4

    .line 179
    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-gt v3, v11, :cond_f

    .line 184
    .line 185
    const-wide/16 v6, 0x3

    .line 186
    .line 187
    add-long/2addr v4, v6

    .line 188
    invoke-static {v0, v13, v14}, Lcom/google/android/gms/internal/clearcut/i0;->a([BJ)B

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-le v3, v11, :cond_c

    .line 193
    .line 194
    :cond_f
    :goto_6
    const/4 v6, -0x1

    .line 195
    goto/16 :goto_d

    .line 196
    .line 197
    :cond_10
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 198
    .line 199
    array-length v0, v0

    .line 200
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const-string v1, "Array length=%d, index=%d, limit=%d"

    .line 217
    .line 218
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-direct {v4, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v4

    .line 226
    :goto_7
    :pswitch_0
    if-ge v1, v3, :cond_11

    .line 227
    .line 228
    aget-byte v4, v0, v1

    .line 229
    .line 230
    if-ltz v4, :cond_11

    .line 231
    .line 232
    add-int/lit8 v1, v1, 0x1

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_11
    if-lt v1, v3, :cond_12

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_12
    :goto_8
    if-lt v1, v3, :cond_13

    .line 239
    .line 240
    :goto_9
    const/4 v0, 0x0

    .line 241
    :goto_a
    move v6, v0

    .line 242
    goto/16 :goto_d

    .line 243
    .line 244
    :cond_13
    add-int/lit8 v4, v1, 0x1

    .line 245
    .line 246
    aget-byte v5, v0, v1

    .line 247
    .line 248
    if-gez v5, :cond_1d

    .line 249
    .line 250
    const/16 v6, -0x20

    .line 251
    .line 252
    const/16 v7, -0x41

    .line 253
    .line 254
    if-ge v5, v6, :cond_15

    .line 255
    .line 256
    if-lt v4, v3, :cond_14

    .line 257
    .line 258
    move v6, v5

    .line 259
    goto :goto_d

    .line 260
    :cond_14
    const/16 v6, -0x3e

    .line 261
    .line 262
    if-lt v5, v6, :cond_1b

    .line 263
    .line 264
    add-int/lit8 v1, v1, 0x2

    .line 265
    .line 266
    aget-byte v4, v0, v4

    .line 267
    .line 268
    if-le v4, v7, :cond_12

    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_15
    const/16 v8, -0x10

    .line 272
    .line 273
    if-ge v5, v8, :cond_19

    .line 274
    .line 275
    add-int/lit8 v8, v3, -0x1

    .line 276
    .line 277
    if-lt v4, v8, :cond_16

    .line 278
    .line 279
    :goto_b
    invoke-static {v0, v4, v3}, Lcom/google/android/gms/internal/clearcut/k0;->a([BII)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    goto :goto_a

    .line 284
    :cond_16
    add-int/lit8 v8, v1, 0x2

    .line 285
    .line 286
    aget-byte v4, v0, v4

    .line 287
    .line 288
    if-gt v4, v7, :cond_1b

    .line 289
    .line 290
    const/16 v9, -0x60

    .line 291
    .line 292
    if-ne v5, v6, :cond_17

    .line 293
    .line 294
    if-lt v4, v9, :cond_1b

    .line 295
    .line 296
    :cond_17
    const/16 v6, -0x13

    .line 297
    .line 298
    if-ne v5, v6, :cond_18

    .line 299
    .line 300
    if-ge v4, v9, :cond_1b

    .line 301
    .line 302
    :cond_18
    add-int/lit8 v1, v1, 0x3

    .line 303
    .line 304
    aget-byte v4, v0, v8

    .line 305
    .line 306
    if-le v4, v7, :cond_12

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_19
    add-int/lit8 v6, v3, -0x2

    .line 310
    .line 311
    if-lt v4, v6, :cond_1a

    .line 312
    .line 313
    goto :goto_b

    .line 314
    :cond_1a
    add-int/lit8 v6, v1, 0x2

    .line 315
    .line 316
    aget-byte v4, v0, v4

    .line 317
    .line 318
    if-gt v4, v7, :cond_1b

    .line 319
    .line 320
    shl-int/lit8 v5, v5, 0x1c

    .line 321
    .line 322
    add-int/lit8 v4, v4, 0x70

    .line 323
    .line 324
    add-int/2addr v4, v5

    .line 325
    shr-int/lit8 v4, v4, 0x1e

    .line 326
    .line 327
    if-nez v4, :cond_1b

    .line 328
    .line 329
    add-int/lit8 v4, v1, 0x3

    .line 330
    .line 331
    aget-byte v5, v0, v6

    .line 332
    .line 333
    if-gt v5, v7, :cond_1b

    .line 334
    .line 335
    add-int/lit8 v1, v1, 0x4

    .line 336
    .line 337
    aget-byte v4, v0, v4

    .line 338
    .line 339
    if-le v4, v7, :cond_12

    .line 340
    .line 341
    :cond_1b
    :goto_c
    const/4 v0, -0x1

    .line 342
    goto :goto_a

    .line 343
    :goto_d
    if-nez v6, :cond_1c

    .line 344
    .line 345
    const/4 v0, 0x1

    .line 346
    return v0

    .line 347
    :cond_1c
    const/4 v0, 0x0

    .line 348
    return v0

    .line 349
    :cond_1d
    move v1, v4

    .line 350
    goto :goto_8

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
