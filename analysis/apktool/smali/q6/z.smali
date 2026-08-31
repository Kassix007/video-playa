.class public final Lq6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/h;


# instance fields
.field public final q:Lq6/E;

.field public final r:Lq6/g;

.field public s:Z


# direct methods
.method public constructor <init>(Lq6/E;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lq6/z;->q:Lq6/E;

    .line 10
    .line 11
    new-instance p1, Lq6/g;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lq6/z;->r:Lq6/g;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final R(Ljava/lang/String;)Lq6/h;
    .locals 1

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lq6/g;->i0(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "closed"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final Z(JLq6/g;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Lq6/g;->Z(JLq6/g;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "closed"

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final a()Lq6/h;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Lq6/g;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long v3, v1, v3

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lq6/z;->q:Lq6/E;

    .line 18
    .line 19
    invoke-interface {v3, v1, v2, v0}, Lq6/E;->Z(JLq6/g;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "closed"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final b(J)Lq6/h;
    .locals 13

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    cmp-long v3, p1, v1

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    const/16 p1, 0x30

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lq6/g;->e0(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    if-gez v3, :cond_2

    .line 25
    .line 26
    neg-long p1, p1

    .line 27
    cmp-long v3, p1, v1

    .line 28
    .line 29
    if-gez v3, :cond_1

    .line 30
    .line 31
    const-string p1, "-9223372036854775808"

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lq6/g;->i0(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    move v3, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move v3, v4

    .line 40
    :goto_0
    sget-object v6, Lr6/a;->a:[B

    .line 41
    .line 42
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    rsub-int/lit8 v6, v6, 0x40

    .line 47
    .line 48
    const/16 v7, 0xa

    .line 49
    .line 50
    mul-int/2addr v6, v7

    .line 51
    ushr-int/lit8 v6, v6, 0x5

    .line 52
    .line 53
    sget-object v8, Lr6/a;->b:[J

    .line 54
    .line 55
    aget-wide v9, v8, v6

    .line 56
    .line 57
    cmp-long v8, p1, v9

    .line 58
    .line 59
    if-lez v8, :cond_3

    .line 60
    .line 61
    move v4, v5

    .line 62
    :cond_3
    add-int/2addr v6, v4

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    :cond_4
    invoke-virtual {v0, v6}, Lq6/g;->a0(I)Lq6/B;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object v5, v4, Lq6/B;->a:[B

    .line 72
    .line 73
    iget v8, v4, Lq6/B;->c:I

    .line 74
    .line 75
    add-int/2addr v8, v6

    .line 76
    :goto_1
    cmp-long v9, p1, v1

    .line 77
    .line 78
    if-eqz v9, :cond_5

    .line 79
    .line 80
    int-to-long v9, v7

    .line 81
    rem-long v11, p1, v9

    .line 82
    .line 83
    long-to-int v11, v11

    .line 84
    add-int/lit8 v8, v8, -0x1

    .line 85
    .line 86
    sget-object v12, Lr6/a;->a:[B

    .line 87
    .line 88
    aget-byte v11, v12, v11

    .line 89
    .line 90
    aput-byte v11, v5, v8

    .line 91
    .line 92
    div-long/2addr p1, v9

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    if-eqz v3, :cond_6

    .line 95
    .line 96
    add-int/lit8 v8, v8, -0x1

    .line 97
    .line 98
    const/16 p1, 0x2d

    .line 99
    .line 100
    aput-byte p1, v5, v8

    .line 101
    .line 102
    :cond_6
    iget p1, v4, Lq6/B;->c:I

    .line 103
    .line 104
    add-int/2addr p1, v6

    .line 105
    iput p1, v4, Lq6/B;->c:I

    .line 106
    .line 107
    iget-wide p1, v0, Lq6/g;->r:J

    .line 108
    .line 109
    int-to-long v1, v6

    .line 110
    add-long/2addr p1, v1

    .line 111
    iput-wide p1, v0, Lq6/g;->r:J

    .line 112
    .line 113
    :goto_2
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string p2, "closed"

    .line 120
    .line 121
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lq6/z;->q:Lq6/E;

    .line 2
    .line 3
    iget-boolean v1, p0, Lq6/z;->s:Z

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lq6/z;->r:Lq6/g;

    .line 8
    .line 9
    iget-wide v2, v1, Lq6/g;->r:J

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v2, v3, v1}, Lq6/E;->Z(JLq6/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 24
    :goto_1
    :try_start_1
    invoke-interface {v0}, Lq6/E;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    :cond_1
    :goto_2
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lq6/z;->s:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    throw v1

    .line 39
    :cond_3
    :goto_3
    return-void
.end method

.method public final d()Lq6/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lq6/z;->q:Lq6/E;

    .line 2
    .line 3
    invoke-interface {v0}, Lq6/E;->d()Lq6/I;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final flush()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    iget-wide v1, v0, Lq6/g;->r:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v3, v1, v3

    .line 12
    .line 13
    iget-object v4, p0, Lq6/z;->q:Lq6/E;

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v4, v1, v2, v0}, Lq6/E;->Z(JLq6/g;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {v4}, Lq6/E;->flush()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "closed"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final i(Lq6/j;)Lq6/h;
    .locals 1

    .line 1
    const-string v0, "byteString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lq6/g;->c0(Lq6/j;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "closed"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public final j(J)Lq6/h;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lq6/g;->f0(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string p2, "closed"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lq6/z;->q:Lq6/E;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 3
    invoke-virtual {v0, p1}, Lq6/g;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 4
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    return p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([B)Lq6/h;
    .locals 1

    .line 6
    iget-boolean v0, p0, Lq6/z;->s:Z

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 8
    invoke-virtual {v0, p1}, Lq6/g;->write([B)V

    .line 9
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    return-object p0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeByte(I)Lq6/h;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq6/g;->e0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "closed"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final writeInt(I)Lq6/h;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq6/g;->g0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "closed"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final writeShort(I)Lq6/h;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq6/z;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq6/z;->r:Lq6/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq6/g;->h0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lq6/z;->a()Lq6/h;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "closed"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method
