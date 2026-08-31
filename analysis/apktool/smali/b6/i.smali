.class public final Lb6/i;
.super Lcom/google/android/gms/internal/measurement/I1;
.source "SourceFile"

# interfaces
.implements LY5/b;
.implements LY5/a;


# instance fields
.field public final c:La6/c;

.field public final d:Lb6/l;

.field public final e:LD/u;

.field public final f:LO3/B;

.field public g:I

.field public final h:Lb6/d;


# direct methods
.method public constructor <init>(La6/c;Lb6/l;LD/u;LX5/f;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xd

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/I1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lb6/i;->c:La6/c;

    .line 12
    .line 13
    iput-object p2, p0, Lb6/i;->d:Lb6/l;

    .line 14
    .line 15
    iput-object p3, p0, Lb6/i;->e:LD/u;

    .line 16
    .line 17
    iget-object p2, p1, La6/c;->b:LO3/B;

    .line 18
    .line 19
    iput-object p2, p0, Lb6/i;->f:LO3/B;

    .line 20
    .line 21
    const/4 p2, -0x1

    .line 22
    iput p2, p0, Lb6/i;->g:I

    .line 23
    .line 24
    iget-object p1, p1, La6/c;->a:La6/j;

    .line 25
    .line 26
    iget-boolean p1, p1, La6/j;->c:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lb6/d;

    .line 33
    .line 34
    invoke-direct {p1, p4}, Lb6/d;-><init>(LX5/f;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iput-object p1, p0, Lb6/i;->h:Lb6/d;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final T0()La6/l;
    .locals 2

    .line 1
    new-instance v0, LU/l;

    .line 2
    .line 3
    iget-object v1, p0, Lb6/i;->c:La6/c;

    .line 4
    .line 5
    iget-object v1, v1, La6/c;->a:La6/j;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lb6/i;->e:LD/u;

    .line 11
    .line 12
    iput-object v1, v0, LU/l;->r:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0}, LU/l;->j()La6/l;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final a(LX5/f;)LY5/a;
    .locals 8

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LX5/f;->c()Lcom/google/android/gms/internal/measurement/I1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, LX5/c;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Lb6/i;->c:La6/c;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v0, Lb6/l;->v:Lb6/l;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    sget-object v1, LX5/i;->d:LX5/i;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget-object v0, Lb6/l;->t:Lb6/l;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    sget-object v1, LX5/i;->e:LX5/i;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    invoke-interface {p1, v2}, LX5/f;->i(I)LX5/f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, v3, La6/c;->b:LO3/B;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lb6/e;->b(LX5/f;LO3/B;)LX5/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, LX5/f;->c()Lcom/google/android/gms/internal/measurement/I1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    instance-of v4, v1, LX5/e;

    .line 54
    .line 55
    if-nez v4, :cond_3

    .line 56
    .line 57
    sget-object v4, LX5/h;->d:LX5/h;

    .line 58
    .line 59
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    new-instance p1, Lb6/c;

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, "Value of type \'"

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0}, LX5/f;->b()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v2, "\' can\'t be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is \'"

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-interface {v0}, LX5/f;->c()Lcom/google/android/gms/internal/measurement/I1;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, "\'.\nUse \'allowStructuredMapKeys = true\' in \'Json {}\' builder to convert such maps to [key1, value1, key2, value2,...] arrays."

    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "message"

    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    :goto_0
    sget-object v0, Lb6/l;->u:Lb6/l;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    sget-object v0, Lb6/l;->s:Lb6/l;

    .line 116
    .line 117
    :goto_1
    iget-object v1, p0, Lb6/i;->e:LD/u;

    .line 118
    .line 119
    iget-object v4, v1, LD/u;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v4, LE/Y;

    .line 122
    .line 123
    iget v5, v4, LE/Y;->b:I

    .line 124
    .line 125
    const/4 v6, 0x1

    .line 126
    add-int/2addr v5, v6

    .line 127
    iput v5, v4, LE/Y;->b:I

    .line 128
    .line 129
    iget-object v7, v4, LE/Y;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v7, [Ljava/lang/Object;

    .line 132
    .line 133
    array-length v7, v7

    .line 134
    if-ne v5, v7, :cond_5

    .line 135
    .line 136
    invoke-virtual {v4}, LE/Y;->r()V

    .line 137
    .line 138
    .line 139
    :cond_5
    iget-object v4, v4, LE/Y;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, [Ljava/lang/Object;

    .line 142
    .line 143
    aput-object p1, v4, v5

    .line 144
    .line 145
    iget-char v4, v0, Lb6/l;->q:C

    .line 146
    .line 147
    invoke-virtual {v1, v4}, LD/u;->g(C)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, LD/u;->w()B

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    const/4 v5, 0x4

    .line 155
    if-eq v4, v5, :cond_8

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eq v2, v6, :cond_7

    .line 162
    .line 163
    const/4 v4, 0x2

    .line 164
    if-eq v2, v4, :cond_7

    .line 165
    .line 166
    const/4 v4, 0x3

    .line 167
    if-eq v2, v4, :cond_7

    .line 168
    .line 169
    iget-object v2, p0, Lb6/i;->d:Lb6/l;

    .line 170
    .line 171
    if-ne v2, v0, :cond_6

    .line 172
    .line 173
    iget-object v2, v3, La6/c;->a:La6/j;

    .line 174
    .line 175
    iget-boolean v2, v2, La6/j;->c:Z

    .line 176
    .line 177
    if-eqz v2, :cond_6

    .line 178
    .line 179
    return-object p0

    .line 180
    :cond_6
    new-instance v2, Lb6/i;

    .line 181
    .line 182
    invoke-direct {v2, v3, v0, v1, p1}, Lb6/i;-><init>(La6/c;Lb6/l;LD/u;LX5/f;)V

    .line 183
    .line 184
    .line 185
    return-object v2

    .line 186
    :cond_7
    new-instance v2, Lb6/i;

    .line 187
    .line 188
    invoke-direct {v2, v3, v0, v1, p1}, Lb6/i;-><init>(La6/c;Lb6/l;LD/u;LX5/f;)V

    .line 189
    .line 190
    .line 191
    return-object v2

    .line 192
    :cond_8
    const-string p1, "Unexpected leading comma"

    .line 193
    .line 194
    const/4 v0, 0x6

    .line 195
    const/4 v3, 0x0

    .line 196
    invoke-static {v1, p1, v2, v3, v0}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    throw v3
.end method

.method public final b(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    iget-object v0, v0, LD/u;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LE/Y;

    .line 6
    .line 7
    const-string v1, "descriptor"

    .line 8
    .line 9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "deserializer"

    .line 13
    .line 14
    invoke-static {p3, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lb6/i;->d:Lb6/l;

    .line 18
    .line 19
    sget-object v2, Lb6/l;->u:Lb6/l;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    and-int/lit8 v1, p2, 0x1

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    const/4 v2, -0x2

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v4, v0, LE/Y;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, [I

    .line 37
    .line 38
    iget v5, v0, LE/Y;->b:I

    .line 39
    .line 40
    aget v4, v4, v5

    .line 41
    .line 42
    if-ne v4, v2, :cond_1

    .line 43
    .line 44
    iget-object v4, v0, LE/Y;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, [Ljava/lang/Object;

    .line 47
    .line 48
    sget-object v6, Lb6/f;->a:Lb6/f;

    .line 49
    .line 50
    aput-object v6, v4, v5

    .line 51
    .line 52
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/I1;->b(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p2, v0, LE/Y;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, [I

    .line 61
    .line 62
    iget p3, v0, LE/Y;->b:I

    .line 63
    .line 64
    aget p2, p2, p3

    .line 65
    .line 66
    if-eq p2, v2, :cond_2

    .line 67
    .line 68
    add-int/2addr p3, v3

    .line 69
    iput p3, v0, LE/Y;->b:I

    .line 70
    .line 71
    iget-object p2, v0, LE/Y;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, [Ljava/lang/Object;

    .line 74
    .line 75
    array-length p2, p2

    .line 76
    if-ne p3, p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, LE/Y;->r()V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object p2, v0, LE/Y;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, [Ljava/lang/Object;

    .line 84
    .line 85
    iget p3, v0, LE/Y;->b:I

    .line 86
    .line 87
    aput-object p1, p2, p3

    .line 88
    .line 89
    iget-object p2, v0, LE/Y;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, [I

    .line 92
    .line 93
    aput v2, p2, p3

    .line 94
    .line 95
    :cond_3
    return-object p1
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final e()Z
    .locals 12

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->z()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, LD/u;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "EOF"

    .line 16
    .line 17
    const/4 v5, 0x6

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eq v1, v3, :cond_7

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/16 v8, 0x22

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    if-ne v3, v8, :cond_0

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    move v3, v9

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v7

    .line 36
    :goto_0
    invoke-virtual {v0, v1}, LD/u;->y(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-ge v1, v10, :cond_6

    .line 45
    .line 46
    const/4 v10, -0x1

    .line 47
    if-eq v1, v10, :cond_6

    .line 48
    .line 49
    add-int/lit8 v10, v1, 0x1

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    or-int/lit8 v1, v1, 0x20

    .line 56
    .line 57
    const/16 v11, 0x66

    .line 58
    .line 59
    if-eq v1, v11, :cond_2

    .line 60
    .line 61
    const/16 v11, 0x74

    .line 62
    .line 63
    if-ne v1, v11, :cond_1

    .line 64
    .line 65
    const-string v1, "rue"

    .line 66
    .line 67
    invoke-virtual {v0, v10, v1}, LD/u;->c(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move v1, v9

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "Expected valid boolean literal prefix, but had \'"

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, LD/u;->j()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const/16 v2, 0x27

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v0, v1, v7, v6, v5}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    throw v6

    .line 99
    :cond_2
    const-string v1, "alse"

    .line 100
    .line 101
    invoke-virtual {v0, v10, v1}, LD/u;->c(ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move v1, v7

    .line 105
    :goto_1
    if-eqz v3, :cond_5

    .line 106
    .line 107
    iget v3, v0, LD/u;->b:I

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eq v3, v10, :cond_4

    .line 114
    .line 115
    iget v3, v0, LD/u;->b:I

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ne v2, v8, :cond_3

    .line 122
    .line 123
    iget v2, v0, LD/u;->b:I

    .line 124
    .line 125
    add-int/2addr v2, v9

    .line 126
    iput v2, v0, LD/u;->b:I

    .line 127
    .line 128
    return v1

    .line 129
    :cond_3
    const-string v1, "Expected closing quotation mark"

    .line 130
    .line 131
    invoke-static {v0, v1, v7, v6, v5}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    throw v6

    .line 135
    :cond_4
    invoke-static {v0, v4, v7, v6, v5}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    throw v6

    .line 139
    :cond_5
    return v1

    .line 140
    :cond_6
    invoke-static {v0, v4, v7, v6, v5}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    throw v6

    .line 144
    :cond_7
    invoke-static {v0, v4, v7, v6, v5}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    throw v6
.end method

.method public final f()Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lb6/i;->h:Lb6/d;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-boolean v1, v1, Lb6/d;->b:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-nez v1, :cond_6

    .line 11
    .line 12
    iget-object v1, p0, Lb6/i;->e:LD/u;

    .line 13
    .line 14
    invoke-virtual {v1}, LD/u;->z()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v1, v2}, LD/u;->y(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v3, v1, LD/u;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    sub-int/2addr v4, v2

    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x4

    .line 34
    if-lt v4, v7, :cond_5

    .line 35
    .line 36
    const/4 v8, -0x1

    .line 37
    if-ne v2, v8, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move v8, v6

    .line 41
    :goto_1
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    const-string v9, "null"

    .line 44
    .line 45
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    add-int v10, v2, v8

    .line 50
    .line 51
    invoke-virtual {v3, v10}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-eq v9, v10, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    if-le v4, v7, :cond_4

    .line 62
    .line 63
    add-int/lit8 v4, v2, 0x4

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-static {v3}, Lb6/e;->c(C)B

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    const/4 v6, 0x1

    .line 77
    add-int/2addr v2, v7

    .line 78
    iput v2, v1, LD/u;->b:I

    .line 79
    .line 80
    :cond_5
    :goto_2
    if-nez v6, :cond_6

    .line 81
    .line 82
    return v5

    .line 83
    :cond_6
    return v0
.end method

.method public final h()C
    .locals 5

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Expected single char, but got \'"

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x27

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x6

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {v0, v1, v4, v3, v2}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    throw v3
.end method

.method public final j(LX5/f;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lb6/i;->e:LD/u;

    .line 6
    .line 7
    iget-object v3, v2, LD/u;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LE/Y;

    .line 10
    .line 11
    iget-object v4, v2, LD/u;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    const-string v5, "descriptor"

    .line 16
    .line 17
    invoke-static {v1, v5}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v5, v0, Lb6/i;->d:Lb6/l;

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-string v7, "object"

    .line 27
    .line 28
    const/4 v8, 0x6

    .line 29
    const/4 v9, 0x0

    .line 30
    const/16 v10, 0x3a

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    const/4 v12, 0x1

    .line 34
    const/4 v13, -0x1

    .line 35
    if-eqz v6, :cond_e

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    if-eq v6, v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {v2}, LD/u;->B()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v2}, LD/u;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    iget v4, v0, Lb6/i;->g:I

    .line 51
    .line 52
    if-eq v4, v13, :cond_1

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string v1, "Expected end of the array or comma"

    .line 58
    .line 59
    invoke-static {v2, v1, v11, v9, v8}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    throw v9

    .line 63
    :cond_1
    :goto_0
    add-int/lit8 v13, v4, 0x1

    .line 64
    .line 65
    iput v13, v0, Lb6/i;->g:I

    .line 66
    .line 67
    goto/16 :goto_11

    .line 68
    .line 69
    :cond_2
    if-nez v1, :cond_3

    .line 70
    .line 71
    goto/16 :goto_11

    .line 72
    .line 73
    :cond_3
    const-string v1, "array"

    .line 74
    .line 75
    invoke-static {v2, v1}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v9

    .line 79
    :cond_4
    iget v1, v0, Lb6/i;->g:I

    .line 80
    .line 81
    rem-int/lit8 v4, v1, 0x2

    .line 82
    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    move v4, v12

    .line 86
    goto :goto_1

    .line 87
    :cond_5
    move v4, v11

    .line 88
    :goto_1
    if-eqz v4, :cond_6

    .line 89
    .line 90
    if-eq v1, v13, :cond_7

    .line 91
    .line 92
    invoke-virtual {v2}, LD/u;->B()Z

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    invoke-virtual {v2, v10}, LD/u;->g(C)V

    .line 98
    .line 99
    .line 100
    :cond_7
    :goto_2
    invoke-virtual {v2}, LD/u;->b()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_c

    .line 105
    .line 106
    if-eqz v4, :cond_b

    .line 107
    .line 108
    iget v1, v0, Lb6/i;->g:I

    .line 109
    .line 110
    const/4 v4, 0x4

    .line 111
    if-ne v1, v13, :cond_9

    .line 112
    .line 113
    iget v1, v2, LD/u;->b:I

    .line 114
    .line 115
    if-nez v11, :cond_8

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_8
    const-string v3, "Unexpected leading comma"

    .line 119
    .line 120
    invoke-static {v2, v3, v1, v9, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    throw v9

    .line 124
    :cond_9
    iget v1, v2, LD/u;->b:I

    .line 125
    .line 126
    if-eqz v11, :cond_a

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_a
    const-string v3, "Expected comma after the key-value pair"

    .line 130
    .line 131
    invoke-static {v2, v3, v1, v9, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    throw v9

    .line 135
    :cond_b
    :goto_3
    iget v1, v0, Lb6/i;->g:I

    .line 136
    .line 137
    add-int/lit8 v13, v1, 0x1

    .line 138
    .line 139
    iput v13, v0, Lb6/i;->g:I

    .line 140
    .line 141
    goto/16 :goto_11

    .line 142
    .line 143
    :cond_c
    if-nez v11, :cond_d

    .line 144
    .line 145
    goto/16 :goto_11

    .line 146
    .line 147
    :cond_d
    invoke-static {v2, v7}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v9

    .line 151
    :cond_e
    invoke-virtual {v2}, LD/u;->B()Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    :goto_4
    invoke-virtual {v2}, LD/u;->b()Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    const/16 v15, 0x40

    .line 160
    .line 161
    const-wide/16 v16, 0x1

    .line 162
    .line 163
    iget-object v9, v0, Lb6/i;->h:Lb6/d;

    .line 164
    .line 165
    if-eqz v14, :cond_26

    .line 166
    .line 167
    invoke-virtual {v2}, LD/u;->d()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {v2, v10}, LD/u;->g(C)V

    .line 172
    .line 173
    .line 174
    const-string v14, "<this>"

    .line 175
    .line 176
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    const-string v14, "json"

    .line 180
    .line 181
    iget-object v10, v0, Lb6/i;->c:La6/c;

    .line 182
    .line 183
    invoke-static {v10, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const-string v14, "name"

    .line 187
    .line 188
    invoke-static {v6, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v10}, Lb6/e;->h(LX5/f;La6/c;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v1, v6}, LX5/f;->a(Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    move/from16 v19, v12

    .line 199
    .line 200
    const/4 v12, -0x3

    .line 201
    if-eq v14, v12, :cond_f

    .line 202
    .line 203
    goto/16 :goto_8

    .line 204
    .line 205
    :cond_f
    iget-object v12, v10, La6/c;->a:La6/j;

    .line 206
    .line 207
    iget-boolean v12, v12, La6/j;->d:Z

    .line 208
    .line 209
    if-nez v12, :cond_10

    .line 210
    .line 211
    goto/16 :goto_8

    .line 212
    .line 213
    :cond_10
    const-string v12, "<this>"

    .line 214
    .line 215
    invoke-static {v10, v12}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const-string v12, "descriptor"

    .line 219
    .line 220
    invoke-static {v1, v12}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    iget-object v12, v10, La6/c;->c:Lk3/c;

    .line 224
    .line 225
    new-instance v14, LI2/e;

    .line 226
    .line 227
    const/4 v8, 0x4

    .line 228
    invoke-direct {v14, v8, v1, v10}, LI2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    const-string v8, "descriptor"

    .line 238
    .line 239
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    iget-object v8, v12, Lk3/c;->q:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    .line 245
    .line 246
    invoke-virtual {v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    check-cast v8, Ljava/util/Map;

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    if-eqz v8, :cond_11

    .line 255
    .line 256
    sget-object v11, Lb6/e;->a:Lb6/f;

    .line 257
    .line 258
    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    goto :goto_5

    .line 263
    :cond_11
    move-object/from16 v8, v21

    .line 264
    .line 265
    :goto_5
    if-nez v8, :cond_12

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_12
    move-object/from16 v21, v8

    .line 269
    .line 270
    :goto_6
    if-eqz v21, :cond_13

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_13
    invoke-virtual {v14}, LI2/e;->invoke()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    iget-object v11, v12, Lk3/c;->q:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v11, Ljava/util/concurrent/ConcurrentHashMap;

    .line 280
    .line 281
    invoke-virtual {v11, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    if-nez v12, :cond_14

    .line 286
    .line 287
    new-instance v12, Ljava/util/concurrent/ConcurrentHashMap;

    .line 288
    .line 289
    const/4 v14, 0x2

    .line 290
    invoke-direct {v12, v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v11, v1, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    :cond_14
    check-cast v12, Ljava/util/Map;

    .line 297
    .line 298
    sget-object v11, Lb6/e;->a:Lb6/f;

    .line 299
    .line 300
    invoke-interface {v12, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-object/from16 v21, v8

    .line 304
    .line 305
    :goto_7
    move-object/from16 v8, v21

    .line 306
    .line 307
    check-cast v8, Ljava/util/Map;

    .line 308
    .line 309
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    check-cast v8, Ljava/lang/Integer;

    .line 314
    .line 315
    if-eqz v8, :cond_15

    .line 316
    .line 317
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result v14

    .line 321
    goto :goto_8

    .line 322
    :cond_15
    const/4 v14, -0x3

    .line 323
    :goto_8
    const/4 v8, -0x3

    .line 324
    if-eq v14, v8, :cond_18

    .line 325
    .line 326
    if-eqz v9, :cond_16

    .line 327
    .line 328
    iget-object v1, v9, Lb6/d;->a:LZ5/s;

    .line 329
    .line 330
    if-ge v14, v15, :cond_17

    .line 331
    .line 332
    iget-wide v6, v1, LZ5/s;->c:J

    .line 333
    .line 334
    shl-long v8, v16, v14

    .line 335
    .line 336
    or-long/2addr v6, v8

    .line 337
    iput-wide v6, v1, LZ5/s;->c:J

    .line 338
    .line 339
    :cond_16
    :goto_9
    move v13, v14

    .line 340
    goto/16 :goto_11

    .line 341
    .line 342
    :cond_17
    ushr-int/lit8 v2, v14, 0x6

    .line 343
    .line 344
    add-int/lit8 v2, v2, -0x1

    .line 345
    .line 346
    and-int/lit8 v4, v14, 0x3f

    .line 347
    .line 348
    iget-object v1, v1, LZ5/s;->d:[J

    .line 349
    .line 350
    aget-wide v6, v1, v2

    .line 351
    .line 352
    shl-long v8, v16, v4

    .line 353
    .line 354
    or-long/2addr v6, v8

    .line 355
    aput-wide v6, v1, v2

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_18
    invoke-static {v1, v10}, Lb6/e;->e(LX5/f;La6/c;)Z

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    if-nez v8, :cond_1b

    .line 363
    .line 364
    iget v1, v3, LE/Y;->b:I

    .line 365
    .line 366
    iget-object v5, v3, LE/Y;->d:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v5, [I

    .line 369
    .line 370
    aget v7, v5, v1

    .line 371
    .line 372
    const/4 v8, -0x2

    .line 373
    if-ne v7, v8, :cond_19

    .line 374
    .line 375
    aput v13, v5, v1

    .line 376
    .line 377
    add-int/2addr v1, v13

    .line 378
    iput v1, v3, LE/Y;->b:I

    .line 379
    .line 380
    :cond_19
    iget v1, v3, LE/Y;->b:I

    .line 381
    .line 382
    if-eq v1, v13, :cond_1a

    .line 383
    .line 384
    add-int/2addr v1, v13

    .line 385
    iput v1, v3, LE/Y;->b:I

    .line 386
    .line 387
    :cond_1a
    iget v1, v2, LD/u;->b:I

    .line 388
    .line 389
    const/4 v2, 0x0

    .line 390
    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    const/4 v2, 0x6

    .line 399
    invoke-static {v2, v1, v6}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    new-instance v2, Lb6/c;

    .line 404
    .line 405
    new-instance v5, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    const-string v7, "Encountered an unknown key \'"

    .line 408
    .line 409
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string v6, "\' at offset "

    .line 416
    .line 417
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    const-string v6, " at path: "

    .line 424
    .line 425
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3}, LE/Y;->i()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    const-string v3, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    .line 436
    .line 437
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-static {v4, v1}, Lb6/e;->g(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-direct {v2, v1}, Lb6/c;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw v2

    .line 455
    :cond_1b
    new-instance v8, Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2}, LD/u;->w()B

    .line 461
    .line 462
    .line 463
    move-result v6

    .line 464
    const/16 v10, 0x8

    .line 465
    .line 466
    const/4 v9, 0x6

    .line 467
    if-eq v6, v10, :cond_1c

    .line 468
    .line 469
    if-eq v6, v9, :cond_1c

    .line 470
    .line 471
    invoke-virtual {v2}, LD/u;->j()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move v12, v9

    .line 475
    move/from16 v11, v19

    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    goto/16 :goto_e

    .line 479
    .line 480
    :cond_1c
    :goto_a
    invoke-virtual {v2}, LD/u;->w()B

    .line 481
    .line 482
    .line 483
    move-result v6

    .line 484
    move/from16 v11, v19

    .line 485
    .line 486
    if-ne v6, v11, :cond_1d

    .line 487
    .line 488
    invoke-virtual {v2}, LD/u;->d()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move/from16 v19, v11

    .line 492
    .line 493
    goto :goto_a

    .line 494
    :cond_1d
    if-eq v6, v10, :cond_1e

    .line 495
    .line 496
    if-ne v6, v9, :cond_1f

    .line 497
    .line 498
    :cond_1e
    move v12, v9

    .line 499
    const/4 v14, 0x0

    .line 500
    goto :goto_c

    .line 501
    :cond_1f
    const/16 v9, 0x9

    .line 502
    .line 503
    if-ne v6, v9, :cond_21

    .line 504
    .line 505
    invoke-static {v8}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    check-cast v6, Ljava/lang/Number;

    .line 510
    .line 511
    invoke-virtual {v6}, Ljava/lang/Number;->byteValue()B

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    if-ne v6, v10, :cond_20

    .line 516
    .line 517
    invoke-static {v8}, Ln5/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    :goto_b
    const/4 v12, 0x6

    .line 521
    const/4 v14, 0x0

    .line 522
    goto :goto_d

    .line 523
    :cond_20
    iget v1, v2, LD/u;->b:I

    .line 524
    .line 525
    new-instance v2, Ljava/lang/StringBuilder;

    .line 526
    .line 527
    const-string v5, "found ] instead of } at path: "

    .line 528
    .line 529
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-static {v1, v4, v2}, Lb6/e;->a(ILjava/lang/CharSequence;Ljava/lang/String;)Lb6/c;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    throw v1

    .line 544
    :cond_21
    const/4 v9, 0x7

    .line 545
    if-ne v6, v9, :cond_23

    .line 546
    .line 547
    invoke-static {v8}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    check-cast v6, Ljava/lang/Number;

    .line 552
    .line 553
    invoke-virtual {v6}, Ljava/lang/Number;->byteValue()B

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    const/4 v9, 0x6

    .line 558
    if-ne v6, v9, :cond_22

    .line 559
    .line 560
    invoke-static {v8}, Ln5/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    goto :goto_b

    .line 564
    :cond_22
    iget v1, v2, LD/u;->b:I

    .line 565
    .line 566
    new-instance v2, Ljava/lang/StringBuilder;

    .line 567
    .line 568
    const-string v5, "found } instead of ] at path: "

    .line 569
    .line 570
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-static {v1, v4, v2}, Lb6/e;->a(ILjava/lang/CharSequence;Ljava/lang/String;)Lb6/c;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    throw v1

    .line 585
    :cond_23
    const/16 v9, 0xa

    .line 586
    .line 587
    if-eq v6, v9, :cond_24

    .line 588
    .line 589
    goto :goto_b

    .line 590
    :cond_24
    const-string v1, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    .line 591
    .line 592
    const/4 v3, 0x0

    .line 593
    const/4 v12, 0x6

    .line 594
    const/4 v14, 0x0

    .line 595
    invoke-static {v2, v1, v14, v3, v12}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 596
    .line 597
    .line 598
    throw v3

    .line 599
    :goto_c
    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    :goto_d
    invoke-virtual {v2}, LD/u;->e()B

    .line 607
    .line 608
    .line 609
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    if-nez v6, :cond_25

    .line 614
    .line 615
    :goto_e
    invoke-virtual {v2}, LD/u;->B()Z

    .line 616
    .line 617
    .line 618
    move-result v6

    .line 619
    move v8, v12

    .line 620
    const/4 v9, 0x0

    .line 621
    const/16 v10, 0x3a

    .line 622
    .line 623
    move v12, v11

    .line 624
    move v11, v14

    .line 625
    goto/16 :goto_4

    .line 626
    .line 627
    :cond_25
    move/from16 v19, v11

    .line 628
    .line 629
    move v9, v12

    .line 630
    goto/16 :goto_a

    .line 631
    .line 632
    :cond_26
    move v14, v11

    .line 633
    if-nez v6, :cond_2d

    .line 634
    .line 635
    if-eqz v9, :cond_2b

    .line 636
    .line 637
    iget-object v1, v9, Lb6/d;->a:LZ5/s;

    .line 638
    .line 639
    iget-object v2, v1, LZ5/s;->b:LC0/t;

    .line 640
    .line 641
    iget-object v4, v1, LZ5/s;->a:LX5/f;

    .line 642
    .line 643
    invoke-interface {v4}, LX5/f;->d()I

    .line 644
    .line 645
    .line 646
    move-result v6

    .line 647
    :cond_27
    iget-wide v7, v1, LZ5/s;->c:J

    .line 648
    .line 649
    const-wide/16 v9, -0x1

    .line 650
    .line 651
    cmp-long v11, v7, v9

    .line 652
    .line 653
    if-eqz v11, :cond_28

    .line 654
    .line 655
    not-long v7, v7

    .line 656
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 657
    .line 658
    .line 659
    move-result v7

    .line 660
    iget-wide v8, v1, LZ5/s;->c:J

    .line 661
    .line 662
    shl-long v10, v16, v7

    .line 663
    .line 664
    or-long/2addr v8, v10

    .line 665
    iput-wide v8, v1, LZ5/s;->c:J

    .line 666
    .line 667
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 668
    .line 669
    .line 670
    move-result-object v8

    .line 671
    invoke-virtual {v2, v4, v8}, LC0/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v8

    .line 675
    check-cast v8, Ljava/lang/Boolean;

    .line 676
    .line 677
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 678
    .line 679
    .line 680
    move-result v8

    .line 681
    if-eqz v8, :cond_27

    .line 682
    .line 683
    move v13, v7

    .line 684
    goto :goto_11

    .line 685
    :cond_28
    if-le v6, v15, :cond_2b

    .line 686
    .line 687
    iget-object v1, v1, LZ5/s;->d:[J

    .line 688
    .line 689
    array-length v6, v1

    .line 690
    move v11, v14

    .line 691
    :goto_f
    if-ge v11, v6, :cond_2b

    .line 692
    .line 693
    add-int/lit8 v7, v11, 0x1

    .line 694
    .line 695
    mul-int/lit8 v8, v7, 0x40

    .line 696
    .line 697
    aget-wide v14, v1, v11

    .line 698
    .line 699
    :goto_10
    cmp-long v12, v14, v9

    .line 700
    .line 701
    if-eqz v12, :cond_2a

    .line 702
    .line 703
    not-long v9, v14

    .line 704
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 705
    .line 706
    .line 707
    move-result v9

    .line 708
    shl-long v19, v16, v9

    .line 709
    .line 710
    or-long v14, v14, v19

    .line 711
    .line 712
    add-int/2addr v9, v8

    .line 713
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 714
    .line 715
    .line 716
    move-result-object v10

    .line 717
    invoke-virtual {v2, v4, v10}, LC0/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v10

    .line 721
    check-cast v10, Ljava/lang/Boolean;

    .line 722
    .line 723
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 724
    .line 725
    .line 726
    move-result v10

    .line 727
    if-eqz v10, :cond_29

    .line 728
    .line 729
    aput-wide v14, v1, v11

    .line 730
    .line 731
    move v13, v9

    .line 732
    goto :goto_11

    .line 733
    :cond_29
    const-wide/16 v9, -0x1

    .line 734
    .line 735
    goto :goto_10

    .line 736
    :cond_2a
    aput-wide v14, v1, v11

    .line 737
    .line 738
    move v11, v7

    .line 739
    const-wide/16 v9, -0x1

    .line 740
    .line 741
    goto :goto_f

    .line 742
    :cond_2b
    :goto_11
    sget-object v1, Lb6/l;->u:Lb6/l;

    .line 743
    .line 744
    if-eq v5, v1, :cond_2c

    .line 745
    .line 746
    iget-object v1, v3, LE/Y;->d:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v1, [I

    .line 749
    .line 750
    iget v2, v3, LE/Y;->b:I

    .line 751
    .line 752
    aput v13, v1, v2

    .line 753
    .line 754
    :cond_2c
    return v13

    .line 755
    :cond_2d
    invoke-static {v2, v7}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    const/16 v18, 0x0

    .line 759
    .line 760
    throw v18
.end method

.method public final l(LX5/f;)V
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LX5/f;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lb6/i;->c:La6/c;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lb6/e;->e(LX5/f;La6/c;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lb6/i;->j(LX5/f;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, Lb6/i;->e:LD/u;

    .line 28
    .line 29
    invoke-virtual {p1}, LD/u;->B()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    iget-object v0, p0, Lb6/i;->d:Lb6/l;

    .line 36
    .line 37
    iget-char v0, v0, Lb6/l;->r:C

    .line 38
    .line 39
    invoke-virtual {p1, v0}, LD/u;->g(C)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, LD/u;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, LE/Y;

    .line 45
    .line 46
    iget v0, p1, LE/Y;->b:I

    .line 47
    .line 48
    iget-object v2, p1, LE/Y;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, [I

    .line 51
    .line 52
    aget v3, v2, v0

    .line 53
    .line 54
    const/4 v4, -0x2

    .line 55
    if-ne v3, v4, :cond_2

    .line 56
    .line 57
    aput v1, v2, v0

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    iput v0, p1, LE/Y;->b:I

    .line 61
    .line 62
    :cond_2
    iget v0, p1, LE/Y;->b:I

    .line 63
    .line 64
    if-eq v0, v1, :cond_3

    .line 65
    .line 66
    add-int/2addr v0, v1

    .line 67
    iput v0, p1, LE/Y;->b:I

    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    :cond_4
    const-string v0, ""

    .line 71
    .line 72
    invoke-static {p1, v0}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    throw p1
.end method

.method public final m(LX5/f;)LY5/b;
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb6/j;->a:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {p1}, LX5/f;->isInline()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lb6/j;->a:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, Lb6/b;

    .line 23
    .line 24
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 25
    .line 26
    iget-object v1, p0, Lb6/i;->c:La6/c;

    .line 27
    .line 28
    invoke-direct {p1, v0, v1}, Lb6/b;-><init>(LD/u;La6/c;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    return-object p0
.end method

.method public final n()I
    .locals 6

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-long v4, v3

    .line 9
    cmp-long v4, v1, v4

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "Failed to parse int for input \'"

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x27

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x6

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {v0, v1, v2, v4, v3}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    throw v4
.end method

.method public final p(LV5/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lb6/i;->c:La6/c;

    .line 2
    .line 3
    iget-object v1, p0, Lb6/i;->e:LD/u;

    .line 4
    .line 5
    iget-object v2, v1, LD/u;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LE/Y;

    .line 8
    .line 9
    const-string v3, "Expected "

    .line 10
    .line 11
    const-string v4, "deserializer"

    .line 12
    .line 13
    invoke-static {p1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    instance-of v4, p1, LV5/c;

    .line 17
    .line 18
    if-eqz v4, :cond_5

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, LV5/c;

    .line 22
    .line 23
    invoke-interface {v4}, LV5/a;->b()LX5/f;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4, v0}, Lb6/e;->d(LX5/f;La6/c;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v1, v4}, LD/u;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x0

    .line 36
    if-nez v4, :cond_4

    .line 37
    .line 38
    instance-of v1, p1, LV5/c;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    move-object v1, p1

    .line 43
    check-cast v1, LV5/c;

    .line 44
    .line 45
    invoke-interface {v1}, LV5/a;->b()LX5/f;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1, v0}, Lb6/e;->d(LX5/f;La6/c;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0}, Lb6/i;->T0()La6/l;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v4, p1

    .line 58
    check-cast v4, LV5/c;

    .line 59
    .line 60
    invoke-interface {v4}, LV5/a;->b()LX5/f;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, LX5/f;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    instance-of v6, v1, La6/x;

    .line 69
    .line 70
    const/4 v7, -0x1

    .line 71
    if-eqz v6, :cond_2

    .line 72
    .line 73
    check-cast v1, La6/x;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, La6/x;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La6/l;

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    invoke-static {v0}, La6/m;->a(La6/l;)La6/B;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    instance-of v3, v0, La6/u;

    .line 88
    .line 89
    if-eqz v3, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {v0}, La6/B;->d()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_0
    .catch LV5/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    goto :goto_1

    .line 97
    :catch_0
    move-exception p1

    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :cond_1
    :goto_0
    move-object v0, v5

    .line 101
    :goto_1
    :try_start_1
    check-cast p1, LV5/c;

    .line 102
    .line 103
    invoke-static {p1, p0, v0}, LD5/a;->v(LV5/c;LY5/a;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v5
    :try_end_1
    .catch LV5/d; {:try_start_1 .. :try_end_1} :catch_1

    .line 107
    :catch_1
    move-exception p1

    .line 108
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, La6/x;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v7, v0, p1}, Lb6/e;->a(ILjava/lang/CharSequence;Ljava/lang/String;)Lb6/c;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    throw p1

    .line 124
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-class v0, La6/x;

    .line 130
    .line 131
    invoke-static {v0}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lkotlin/jvm/internal/f;->c()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v0, ", but had "

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Lkotlin/jvm/internal/f;->c()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, " as the serialized body of "

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, " at element: "

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, LE/Y;->i()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v7, v0, p1}, Lb6/e;->a(ILjava/lang/CharSequence;Ljava/lang/String;)Lb6/c;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    throw p1

    .line 195
    :cond_3
    invoke-interface {p1, p0}, LV5/a;->c(LY5/b;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1
    :try_end_2
    .catch LV5/b; {:try_start_2 .. :try_end_2} :catch_0

    .line 199
    return-object p1

    .line 200
    :cond_4
    :try_start_3
    check-cast p1, LV5/c;

    .line 201
    .line 202
    invoke-static {p1, p0, v4}, LD5/a;->v(LV5/c;LY5/a;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v5
    :try_end_3
    .catch LV5/d; {:try_start_3 .. :try_end_3} :catch_2

    .line 206
    :catch_2
    move-exception p1

    .line 207
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    const/16 v3, 0xa

    .line 215
    .line 216
    invoke-static {v0, v3}, LJ5/m;->j1(Ljava/lang/String;C)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const-string v4, "."

    .line 221
    .line 222
    invoke-static {v0, v4}, LJ5/m;->b1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const-string v4, ""

    .line 234
    .line 235
    invoke-static {v3, p1, v4}, LJ5/m;->g1(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    const/4 v3, 0x0

    .line 240
    const/4 v4, 0x2

    .line 241
    invoke-static {v1, v0, v3, p1, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    throw v5

    .line 245
    :cond_5
    invoke-interface {p1, p0}, LV5/a;->c(LY5/b;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1
    :try_end_4
    .catch LV5/b; {:try_start_4 .. :try_end_4} :catch_0

    .line 249
    return-object p1

    .line 250
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    const-string v1, "at path"

    .line 258
    .line 259
    invoke-static {v0, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_6

    .line 264
    .line 265
    throw p1

    .line 266
    :cond_6
    new-instance v0, LV5/b;

    .line 267
    .line 268
    new-instance v1, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v3, " at path: "

    .line 281
    .line 282
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, LE/Y;->i()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    iget-object v2, p1, LV5/b;->q:Ljava/util/List;

    .line 297
    .line 298
    invoke-direct {v0, v2, v1, p1}, LV5/b;-><init>(Ljava/util/List;Ljava/lang/String;LV5/b;)V

    .line 299
    .line 300
    .line 301
    throw v0
.end method

.method public final q()LO3/B;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/i;->f:LO3/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()B
    .locals 6

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-byte v3, v3

    .line 9
    int-to-long v4, v3

    .line 10
    cmp-long v4, v1, v4

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Failed to parse byte for input \'"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x27

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x6

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v0, v1, v2, v4, v3}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v4
.end method

.method public final v()S
    .locals 6

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-short v3, v3

    .line 9
    int-to-long v4, v3

    .line 10
    cmp-long v4, v1, v4

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Failed to parse short for input \'"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x27

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x6

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v0, v1, v2, v4, v3}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v4
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->i()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final x()F
    .locals 5

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 17
    .line 18
    .line 19
    cmpg-float v3, v3, v4

    .line 20
    .line 21
    if-gtz v3, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lb6/e;->i(LD/u;Ljava/lang/Number;)V

    .line 29
    .line 30
    .line 31
    throw v2

    .line 32
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v4, "Failed to parse type \'float\' for input \'"

    .line 35
    .line 36
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x27

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x6

    .line 53
    invoke-static {v0, v1, v3, v2, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    throw v2
.end method

.method public final z()D
    .locals 9

    .line 1
    iget-object v0, p0, Lb6/i;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/u;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmpg-double v1, v5, v7

    .line 22
    .line 23
    if-gtz v1, :cond_0

    .line 24
    .line 25
    return-wide v3

    .line 26
    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Lb6/e;->i(LD/u;Ljava/lang/Number;)V

    .line 31
    .line 32
    .line 33
    throw v2

    .line 34
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v4, "Failed to parse type \'double\' for input \'"

    .line 37
    .line 38
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x27

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v4, 0x6

    .line 55
    invoke-static {v0, v1, v3, v2, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    throw v2
.end method
