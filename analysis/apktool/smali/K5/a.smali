.class public final LK5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final r:J

.field public static final s:J

.field public static final synthetic t:I


# instance fields
.field public final q:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, LK5/b;->a:I

    .line 2
    .line 3
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LK5/f;->d(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    sput-wide v0, LK5/a;->r:J

    .line 13
    .line 14
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, LK5/f;->d(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, LK5/a;->s:J

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LK5/a;->q:J

    .line 5
    .line 6
    return-void
.end method

.method public static final a(JJ)J
    .locals 10

    .line 1
    const v0, 0xf4240

    .line 2
    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    div-long v2, p2, v0

    .line 6
    .line 7
    add-long v4, p0, v2

    .line 8
    .line 9
    const-wide p0, -0x431bde82d7aL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p0, p0, v4

    .line 15
    .line 16
    if-gtz p0, :cond_0

    .line 17
    .line 18
    const-wide p0, 0x431bde82d7bL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p0, v4, p0

    .line 24
    .line 25
    if-gez p0, :cond_0

    .line 26
    .line 27
    mul-long/2addr v2, v0

    .line 28
    sub-long/2addr p2, v2

    .line 29
    mul-long/2addr v4, v0

    .line 30
    add-long/2addr v4, p2

    .line 31
    const/4 p0, 0x1

    .line 32
    shl-long p0, v4, p0

    .line 33
    .line 34
    sget p2, LK5/b;->a:I

    .line 35
    .line 36
    return-wide p0

    .line 37
    :cond_0
    const-wide v6, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static/range {v4 .. v9}, LD5/a;->r(JJJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-static {p0, p1}, LK5/f;->d(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p0

    .line 55
    return-wide p0
.end method

.method public static final b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    const/16 p1, 0x2e

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p3, p1}, LJ5/m;->Y0(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const/4 p3, -0x1

    .line 24
    add-int/2addr p2, p3

    .line 25
    if-ltz p2, :cond_2

    .line 26
    .line 27
    :goto_0
    add-int/lit8 v0, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x30

    .line 34
    .line 35
    if-eq v1, v2, :cond_0

    .line 36
    .line 37
    move p3, p2

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    if-gez v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move p2, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    add-int/lit8 p2, p3, 0x1

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x3

    .line 48
    if-nez p5, :cond_3

    .line 49
    .line 50
    if-ge p2, v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/2addr p3, v1

    .line 57
    div-int/2addr p3, v1

    .line 58
    mul-int/2addr p3, v1

    .line 59
    invoke-virtual {p0, p1, v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_2
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static final c(J)Z
    .locals 2

    .line 1
    sget-wide v0, LK5/a;->r:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-wide v0, LK5/a;->s:J

    .line 8
    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static final d(JJ)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, LK5/a;->c(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {p2, p3}, LK5/a;->c(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    xor-long/2addr p2, p0

    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long p2, p2, v0

    .line 17
    .line 18
    if-ltz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string p1, "Summing infinite durations of different signs yields an undefined result."

    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    return-wide p0

    .line 30
    :cond_2
    invoke-static {p2, p3}, LK5/a;->c(J)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    return-wide p2

    .line 37
    :cond_3
    long-to-int v0, p0

    .line 38
    const/4 v1, 0x1

    .line 39
    and-int/2addr v0, v1

    .line 40
    long-to-int v2, p2

    .line 41
    and-int/2addr v2, v1

    .line 42
    if-ne v0, v2, :cond_6

    .line 43
    .line 44
    shr-long/2addr p0, v1

    .line 45
    shr-long/2addr p2, v1

    .line 46
    add-long/2addr p0, p2

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    const-wide p2, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmp-long p2, p2, p0

    .line 55
    .line 56
    if-gtz p2, :cond_4

    .line 57
    .line 58
    const-wide p2, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    cmp-long p2, p0, p2

    .line 64
    .line 65
    if-gez p2, :cond_4

    .line 66
    .line 67
    shl-long/2addr p0, v1

    .line 68
    sget p2, LK5/b;->a:I

    .line 69
    .line 70
    return-wide p0

    .line 71
    :cond_4
    const p2, 0xf4240

    .line 72
    .line 73
    .line 74
    int-to-long p2, p2

    .line 75
    div-long/2addr p0, p2

    .line 76
    invoke-static {p0, p1}, LK5/f;->d(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide p0

    .line 80
    return-wide p0

    .line 81
    :cond_5
    invoke-static {p0, p1}, LK5/f;->e(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide p0

    .line 85
    return-wide p0

    .line 86
    :cond_6
    if-ne v0, v1, :cond_7

    .line 87
    .line 88
    shr-long/2addr p0, v1

    .line 89
    shr-long/2addr p2, v1

    .line 90
    invoke-static {p0, p1, p2, p3}, LK5/a;->a(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide p0

    .line 94
    return-wide p0

    .line 95
    :cond_7
    shr-long/2addr p2, v1

    .line 96
    shr-long/2addr p0, v1

    .line 97
    invoke-static {p2, p3, p0, p1}, LK5/a;->a(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide p0

    .line 101
    return-wide p0
.end method

.method public static final e(JLK5/c;)J
    .locals 3

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-wide v0, LK5/a;->r:J

    .line 7
    .line 8
    cmp-long v0, p0, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide p0, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    return-wide p0

    .line 18
    :cond_0
    sget-wide v0, LK5/a;->s:J

    .line 19
    .line 20
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-wide/high16 p0, -0x8000000000000000L

    .line 25
    .line 26
    return-wide p0

    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    shr-long v1, p0, v0

    .line 29
    .line 30
    long-to-int p0, p0

    .line 31
    and-int/2addr p0, v0

    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    sget-object p0, LK5/c;->r:LK5/c;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget-object p0, LK5/c;->s:LK5/c;

    .line 38
    .line 39
    :goto_0
    invoke-static {v1, v2, p0, p2}, LK5/f;->c(JLK5/c;LK5/c;)J

    .line 40
    .line 41
    .line 42
    move-result-wide p0

    .line 43
    return-wide p0
.end method

.method public static final f(J)J
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    shr-long v1, p0, v0

    .line 3
    .line 4
    neg-long v1, v1

    .line 5
    long-to-int p0, p0

    .line 6
    and-int/2addr p0, v0

    .line 7
    shl-long v0, v1, v0

    .line 8
    .line 9
    int-to-long p0, p0

    .line 10
    add-long/2addr v0, p0

    .line 11
    sget p0, LK5/b;->a:I

    .line 12
    .line 13
    return-wide v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 9

    .line 1
    check-cast p1, LK5/a;

    .line 2
    .line 3
    iget-wide v0, p1, LK5/a;->q:J

    .line 4
    .line 5
    iget-wide v2, p0, LK5/a;->q:J

    .line 6
    .line 7
    xor-long v4, v2, v0

    .line 8
    .line 9
    const-wide/16 v6, 0x0

    .line 10
    .line 11
    cmp-long p1, v4, v6

    .line 12
    .line 13
    const/4 v8, 0x1

    .line 14
    if-ltz p1, :cond_2

    .line 15
    .line 16
    long-to-int p1, v4

    .line 17
    and-int/2addr p1, v8

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    long-to-int p1, v2

    .line 22
    and-int/2addr p1, v8

    .line 23
    long-to-int v0, v0

    .line 24
    and-int/2addr v0, v8

    .line 25
    sub-int/2addr p1, v0

    .line 26
    cmp-long v0, v2, v6

    .line 27
    .line 28
    if-gez v0, :cond_1

    .line 29
    .line 30
    neg-int p1, p1

    .line 31
    :cond_1
    return p1

    .line 32
    :cond_2
    :goto_0
    cmp-long p1, v2, v0

    .line 33
    .line 34
    if-gez p1, :cond_3

    .line 35
    .line 36
    const/4 p1, -0x1

    .line 37
    return p1

    .line 38
    :cond_3
    if-nez p1, :cond_4

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    return p1

    .line 42
    :cond_4
    return v8
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, LK5/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, LK5/a;

    .line 7
    .line 8
    iget-wide v0, p1, LK5/a;->q:J

    .line 9
    .line 10
    iget-wide v2, p0, LK5/a;->q:J

    .line 11
    .line 12
    cmp-long p1, v2, v0

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    const/4 p1, 0x1

    .line 19
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, LK5/a;->q:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, LK5/a;->q:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    if-nez v5, :cond_0

    .line 10
    .line 11
    const-string v1, "0s"

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    sget-wide v6, LK5/a;->r:J

    .line 15
    .line 16
    cmp-long v6, v1, v6

    .line 17
    .line 18
    if-nez v6, :cond_1

    .line 19
    .line 20
    const-string v1, "Infinity"

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    sget-wide v6, LK5/a;->s:J

    .line 24
    .line 25
    cmp-long v6, v1, v6

    .line 26
    .line 27
    if-nez v6, :cond_2

    .line 28
    .line 29
    const-string v1, "-Infinity"

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_2
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    if-gez v5, :cond_3

    .line 35
    .line 36
    move v8, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move v8, v6

    .line 39
    :goto_0
    new-instance v9, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    if-eqz v8, :cond_4

    .line 45
    .line 46
    const/16 v10, 0x2d

    .line 47
    .line 48
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_4
    if-gez v5, :cond_5

    .line 52
    .line 53
    invoke-static {v1, v2}, LK5/a;->f(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    :cond_5
    sget-object v5, LK5/c;->w:LK5/c;

    .line 58
    .line 59
    invoke-static {v1, v2, v5}, LK5/a;->e(JLK5/c;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    invoke-static {v1, v2}, LK5/a;->c(J)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_6

    .line 68
    .line 69
    move v5, v6

    .line 70
    goto :goto_1

    .line 71
    :cond_6
    sget-object v5, LK5/c;->v:LK5/c;

    .line 72
    .line 73
    invoke-static {v1, v2, v5}, LK5/a;->e(JLK5/c;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v12

    .line 77
    const/16 v5, 0x18

    .line 78
    .line 79
    int-to-long v14, v5

    .line 80
    rem-long/2addr v12, v14

    .line 81
    long-to-int v5, v12

    .line 82
    :goto_1
    invoke-static {v1, v2}, LK5/a;->c(J)Z

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const/16 v13, 0x3c

    .line 87
    .line 88
    if-eqz v12, :cond_7

    .line 89
    .line 90
    move-wide/from16 v16, v3

    .line 91
    .line 92
    move v3, v6

    .line 93
    goto :goto_2

    .line 94
    :cond_7
    sget-object v12, LK5/c;->u:LK5/c;

    .line 95
    .line 96
    invoke-static {v1, v2, v12}, LK5/a;->e(JLK5/c;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v14

    .line 100
    move-wide/from16 v16, v3

    .line 101
    .line 102
    int-to-long v3, v13

    .line 103
    rem-long/2addr v14, v3

    .line 104
    long-to-int v3, v14

    .line 105
    :goto_2
    invoke-static {v1, v2}, LK5/a;->c(J)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_8

    .line 110
    .line 111
    move v4, v6

    .line 112
    goto :goto_3

    .line 113
    :cond_8
    sget-object v4, LK5/c;->t:LK5/c;

    .line 114
    .line 115
    invoke-static {v1, v2, v4}, LK5/a;->e(JLK5/c;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v14

    .line 119
    int-to-long v12, v13

    .line 120
    rem-long/2addr v14, v12

    .line 121
    long-to-int v4, v14

    .line 122
    :goto_3
    invoke-static {v1, v2}, LK5/a;->c(J)Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    if-eqz v12, :cond_9

    .line 127
    .line 128
    const/4 v1, 0x0

    .line 129
    goto :goto_5

    .line 130
    :cond_9
    long-to-int v12, v1

    .line 131
    const/4 v13, 0x1

    .line 132
    and-int/2addr v12, v13

    .line 133
    if-ne v12, v13, :cond_a

    .line 134
    .line 135
    shr-long/2addr v1, v13

    .line 136
    const/16 v12, 0x3e8

    .line 137
    .line 138
    int-to-long v12, v12

    .line 139
    rem-long/2addr v1, v12

    .line 140
    const v12, 0xf4240

    .line 141
    .line 142
    .line 143
    int-to-long v12, v12

    .line 144
    mul-long/2addr v1, v12

    .line 145
    :goto_4
    long-to-int v1, v1

    .line 146
    goto :goto_5

    .line 147
    :cond_a
    shr-long/2addr v1, v13

    .line 148
    const v12, 0x3b9aca00

    .line 149
    .line 150
    .line 151
    int-to-long v12, v12

    .line 152
    rem-long/2addr v1, v12

    .line 153
    goto :goto_4

    .line 154
    :goto_5
    cmp-long v2, v10, v16

    .line 155
    .line 156
    if-eqz v2, :cond_b

    .line 157
    .line 158
    move v2, v7

    .line 159
    goto :goto_6

    .line 160
    :cond_b
    move v2, v6

    .line 161
    :goto_6
    if-eqz v5, :cond_c

    .line 162
    .line 163
    move v12, v7

    .line 164
    goto :goto_7

    .line 165
    :cond_c
    move v12, v6

    .line 166
    :goto_7
    if-eqz v3, :cond_d

    .line 167
    .line 168
    move v13, v7

    .line 169
    goto :goto_8

    .line 170
    :cond_d
    move v13, v6

    .line 171
    :goto_8
    if-nez v4, :cond_f

    .line 172
    .line 173
    if-eqz v1, :cond_e

    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_e
    move v14, v6

    .line 177
    goto :goto_a

    .line 178
    :cond_f
    :goto_9
    move v14, v7

    .line 179
    :goto_a
    if-eqz v2, :cond_10

    .line 180
    .line 181
    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const/16 v6, 0x64

    .line 185
    .line 186
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    move v6, v7

    .line 190
    :cond_10
    const/16 v10, 0x20

    .line 191
    .line 192
    if-nez v12, :cond_11

    .line 193
    .line 194
    if-eqz v2, :cond_13

    .line 195
    .line 196
    if-nez v13, :cond_11

    .line 197
    .line 198
    if-eqz v14, :cond_13

    .line 199
    .line 200
    :cond_11
    add-int/lit8 v11, v6, 0x1

    .line 201
    .line 202
    if-lez v6, :cond_12

    .line 203
    .line 204
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    :cond_12
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const/16 v5, 0x68

    .line 211
    .line 212
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    move v6, v11

    .line 216
    :cond_13
    if-nez v13, :cond_14

    .line 217
    .line 218
    if-eqz v14, :cond_16

    .line 219
    .line 220
    if-nez v12, :cond_14

    .line 221
    .line 222
    if-eqz v2, :cond_16

    .line 223
    .line 224
    :cond_14
    add-int/lit8 v5, v6, 0x1

    .line 225
    .line 226
    if-lez v6, :cond_15

    .line 227
    .line 228
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    :cond_15
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const/16 v3, 0x6d

    .line 235
    .line 236
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    move v6, v5

    .line 240
    :cond_16
    if-eqz v14, :cond_1c

    .line 241
    .line 242
    add-int/lit8 v3, v6, 0x1

    .line 243
    .line 244
    if-lez v6, :cond_17

    .line 245
    .line 246
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    :cond_17
    if-nez v4, :cond_1b

    .line 250
    .line 251
    if-nez v2, :cond_1b

    .line 252
    .line 253
    if-nez v12, :cond_1b

    .line 254
    .line 255
    if-eqz v13, :cond_18

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_18
    const v2, 0xf4240

    .line 259
    .line 260
    .line 261
    if-lt v1, v2, :cond_19

    .line 262
    .line 263
    div-int v10, v1, v2

    .line 264
    .line 265
    rem-int v11, v1, v2

    .line 266
    .line 267
    const-string v13, "ms"

    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const/4 v12, 0x6

    .line 271
    invoke-static/range {v9 .. v14}, LK5/a;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 272
    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_19
    const/16 v2, 0x3e8

    .line 276
    .line 277
    if-lt v1, v2, :cond_1a

    .line 278
    .line 279
    div-int/lit16 v10, v1, 0x3e8

    .line 280
    .line 281
    rem-int/lit16 v11, v1, 0x3e8

    .line 282
    .line 283
    const-string v13, "us"

    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/4 v12, 0x3

    .line 287
    invoke-static/range {v9 .. v14}, LK5/a;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_c

    .line 291
    :cond_1a
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v1, "ns"

    .line 295
    .line 296
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_1b
    :goto_b
    const-string v13, "s"

    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    const/16 v12, 0x9

    .line 304
    .line 305
    move v11, v1

    .line 306
    move v10, v4

    .line 307
    invoke-static/range {v9 .. v14}, LK5/a;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 308
    .line 309
    .line 310
    :goto_c
    move v6, v3

    .line 311
    :cond_1c
    if-eqz v8, :cond_1d

    .line 312
    .line 313
    if-le v6, v7, :cond_1d

    .line 314
    .line 315
    const/16 v1, 0x28

    .line 316
    .line 317
    invoke-virtual {v9, v7, v1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    const/16 v2, 0x29

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    :cond_1d
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    return-object v1
.end method
