.class public final Lcom/google/android/gms/internal/clearcut/Y;
.super Ljava/lang/Object;


# instance fields
.field public A:Ljava/lang/Object;

.field public final a:LU/l;

.field public final b:[Ljava/lang/Object;

.field public final c:Ljava/lang/Class;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:[I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Ljava/lang/reflect/Field;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->p:I

    .line 8
    .line 9
    const/high16 v0, -0x80000000

    .line 10
    .line 11
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->q:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->r:I

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/Y;->c:Ljava/lang/Class;

    .line 17
    .line 18
    new-instance p1, LU/l;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p1, LU/l;->r:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    iput p2, p1, LU/l;->q:I

    .line 27
    .line 28
    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/Y;->a:LU/l;

    .line 29
    .line 30
    iput-object p3, p0, Lcom/google/android/gms/internal/clearcut/Y;->b:[Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p1}, LU/l;->i()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iput p2, p0, Lcom/google/android/gms/internal/clearcut/Y;->d:I

    .line 37
    .line 38
    invoke-virtual {p1}, LU/l;->i()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iput p2, p0, Lcom/google/android/gms/internal/clearcut/Y;->e:I

    .line 43
    .line 44
    const/4 p3, 0x0

    .line 45
    if-nez p2, :cond_0

    .line 46
    .line 47
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->f:I

    .line 48
    .line 49
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->g:I

    .line 50
    .line 51
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->h:I

    .line 52
    .line 53
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->i:I

    .line 54
    .line 55
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->k:I

    .line 56
    .line 57
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->j:I

    .line 58
    .line 59
    iput v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->l:I

    .line 60
    .line 61
    iput-object p3, p0, Lcom/google/android/gms/internal/clearcut/Y;->m:[I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    invoke-virtual {p1}, LU/l;->i()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    iput p2, p0, Lcom/google/android/gms/internal/clearcut/Y;->f:I

    .line 69
    .line 70
    invoke-virtual {p1}, LU/l;->i()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p1}, LU/l;->i()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->g:I

    .line 79
    .line 80
    invoke-virtual {p1}, LU/l;->i()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->h:I

    .line 85
    .line 86
    invoke-virtual {p1}, LU/l;->i()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->k:I

    .line 91
    .line 92
    invoke-virtual {p1}, LU/l;->i()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->j:I

    .line 97
    .line 98
    invoke-virtual {p1}, LU/l;->i()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->i:I

    .line 103
    .line 104
    invoke-virtual {p1}, LU/l;->i()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->l:I

    .line 109
    .line 110
    invoke-virtual {p1}, LU/l;->i()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    new-array p3, p1, [I

    .line 118
    .line 119
    :goto_0
    iput-object p3, p0, Lcom/google/android/gms/internal/clearcut/Y;->m:[I

    .line 120
    .line 121
    shl-int/lit8 p1, p2, 0x1

    .line 122
    .line 123
    add-int/2addr p1, v0

    .line 124
    iput p1, p0, Lcom/google/android/gms/internal/clearcut/Y;->n:I

    .line 125
    .line 126
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/lit8 v2, v2, 0x28

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    add-int/2addr v3, v2

    .line 55
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v2, v3

    .line 64
    new-instance v3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const-string v2, "Field "

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p0, " for "

    .line 78
    .line 79
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, " not found. Known fields are "

    .line 86
    .line 87
    invoke-static {v3, p0, v0}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v1
.end method


# virtual methods
.method public final a()Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->a:LU/l;

    .line 4
    .line 5
    iget v2, v1, LU/l;->q:I

    .line 6
    .line 7
    iget-object v3, v1, LU/l;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_13

    .line 16
    .line 17
    invoke-virtual {v1}, LU/l;->i()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iput v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->s:I

    .line 22
    .line 23
    invoke-virtual {v1}, LU/l;->i()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iput v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->t:I

    .line 28
    .line 29
    and-int/lit16 v3, v2, 0xff

    .line 30
    .line 31
    iput v3, v0, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 32
    .line 33
    iget v4, v0, Lcom/google/android/gms/internal/clearcut/Y;->s:I

    .line 34
    .line 35
    iget v5, v0, Lcom/google/android/gms/internal/clearcut/Y;->p:I

    .line 36
    .line 37
    if-ge v4, v5, :cond_0

    .line 38
    .line 39
    iput v4, v0, Lcom/google/android/gms/internal/clearcut/Y;->p:I

    .line 40
    .line 41
    :cond_0
    iget v5, v0, Lcom/google/android/gms/internal/clearcut/Y;->q:I

    .line 42
    .line 43
    if-le v4, v5, :cond_1

    .line 44
    .line 45
    iput v4, v0, Lcom/google/android/gms/internal/clearcut/Y;->q:I

    .line 46
    .line 47
    :cond_1
    sget-object v5, Lcom/google/android/gms/internal/clearcut/s;->z:Lcom/google/android/gms/internal/clearcut/s;

    .line 48
    .line 49
    iget v6, v5, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 50
    .line 51
    if-ne v3, v6, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object v7, Lcom/google/android/gms/internal/clearcut/s;->u:Lcom/google/android/gms/internal/clearcut/s;

    .line 55
    .line 56
    iget v7, v7, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 57
    .line 58
    if-lt v3, v7, :cond_3

    .line 59
    .line 60
    sget-object v7, Lcom/google/android/gms/internal/clearcut/s;->y:Lcom/google/android/gms/internal/clearcut/s;

    .line 61
    .line 62
    iget v7, v7, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 63
    .line 64
    :cond_3
    :goto_0
    iget v7, v0, Lcom/google/android/gms/internal/clearcut/Y;->r:I

    .line 65
    .line 66
    const/4 v8, 0x1

    .line 67
    add-int/2addr v7, v8

    .line 68
    iput v7, v0, Lcom/google/android/gms/internal/clearcut/Y;->r:I

    .line 69
    .line 70
    iget v9, v0, Lcom/google/android/gms/internal/clearcut/Y;->p:I

    .line 71
    .line 72
    sget-object v10, Lcom/google/android/gms/internal/clearcut/a0;->a:Ljava/lang/Class;

    .line 73
    .line 74
    const/16 v10, 0x28

    .line 75
    .line 76
    if-ge v4, v10, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    int-to-long v10, v4

    .line 80
    int-to-long v12, v9

    .line 81
    sub-long/2addr v10, v12

    .line 82
    int-to-long v12, v7

    .line 83
    const-wide/16 v14, 0x2

    .line 84
    .line 85
    mul-long/2addr v14, v12

    .line 86
    const-wide/16 v16, 0x3

    .line 87
    .line 88
    add-long v14, v14, v16

    .line 89
    .line 90
    add-long v12, v12, v16

    .line 91
    .line 92
    const-wide/16 v18, 0xa

    .line 93
    .line 94
    add-long v10, v10, v18

    .line 95
    .line 96
    mul-long v12, v12, v16

    .line 97
    .line 98
    add-long/2addr v12, v14

    .line 99
    cmp-long v7, v10, v12

    .line 100
    .line 101
    :goto_1
    and-int/lit16 v2, v2, 0x400

    .line 102
    .line 103
    if-eqz v2, :cond_5

    .line 104
    .line 105
    iget v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->o:I

    .line 106
    .line 107
    add-int/lit8 v7, v2, 0x1

    .line 108
    .line 109
    iput v7, v0, Lcom/google/android/gms/internal/clearcut/Y;->o:I

    .line 110
    .line 111
    iget-object v7, v0, Lcom/google/android/gms/internal/clearcut/Y;->m:[I

    .line 112
    .line 113
    aput v4, v7, v2

    .line 114
    .line 115
    :cond_5
    const/4 v2, 0x0

    .line 116
    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->y:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->z:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->A:Ljava/lang/Object;

    .line 121
    .line 122
    iget v2, v0, Lcom/google/android/gms/internal/clearcut/Y;->d:I

    .line 123
    .line 124
    if-le v3, v6, :cond_9

    .line 125
    .line 126
    invoke-virtual {v1}, LU/l;->i()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    iput v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->v:I

    .line 131
    .line 132
    iget v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 133
    .line 134
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->r:Lcom/google/android/gms/internal/clearcut/s;

    .line 135
    .line 136
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 137
    .line 138
    add-int/lit8 v3, v3, 0x33

    .line 139
    .line 140
    if-eq v1, v3, :cond_8

    .line 141
    .line 142
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->t:Lcom/google/android/gms/internal/clearcut/s;

    .line 143
    .line 144
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x33

    .line 147
    .line 148
    if-ne v1, v3, :cond_6

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->s:Lcom/google/android/gms/internal/clearcut/s;

    .line 152
    .line 153
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 154
    .line 155
    add-int/lit8 v3, v3, 0x33

    .line 156
    .line 157
    if-ne v1, v3, :cond_e

    .line 158
    .line 159
    and-int/lit8 v1, v2, 0x1

    .line 160
    .line 161
    if-ne v1, v8, :cond_7

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->z:Ljava/lang/Object;

    .line 168
    .line 169
    :cond_7
    return v8

    .line 170
    :cond_8
    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->y:Ljava/lang/Object;

    .line 175
    .line 176
    return v8

    .line 177
    :cond_9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/lang/String;

    .line 182
    .line 183
    iget-object v4, v0, Lcom/google/android/gms/internal/clearcut/Y;->c:Ljava/lang/Class;

    .line 184
    .line 185
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/clearcut/Y;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    iput-object v3, v0, Lcom/google/android/gms/internal/clearcut/Y;->x:Ljava/lang/reflect/Field;

    .line 190
    .line 191
    and-int/lit8 v3, v2, 0x1

    .line 192
    .line 193
    if-ne v3, v8, :cond_a

    .line 194
    .line 195
    iget v3, v0, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 196
    .line 197
    sget-object v4, Lcom/google/android/gms/internal/clearcut/s;->t:Lcom/google/android/gms/internal/clearcut/s;

    .line 198
    .line 199
    iget v4, v4, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 200
    .line 201
    if-gt v3, v4, :cond_a

    .line 202
    .line 203
    invoke-virtual {v1}, LU/l;->i()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iput v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->w:I

    .line 208
    .line 209
    :cond_a
    iget v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 210
    .line 211
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->r:Lcom/google/android/gms/internal/clearcut/s;

    .line 212
    .line 213
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 214
    .line 215
    if-eq v1, v3, :cond_12

    .line 216
    .line 217
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->t:Lcom/google/android/gms/internal/clearcut/s;

    .line 218
    .line 219
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 220
    .line 221
    if-ne v1, v3, :cond_b

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_b
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->v:Lcom/google/android/gms/internal/clearcut/s;

    .line 225
    .line 226
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 227
    .line 228
    if-eq v1, v3, :cond_11

    .line 229
    .line 230
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->y:Lcom/google/android/gms/internal/clearcut/s;

    .line 231
    .line 232
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 233
    .line 234
    if-ne v1, v3, :cond_c

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_c
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->s:Lcom/google/android/gms/internal/clearcut/s;

    .line 238
    .line 239
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 240
    .line 241
    if-eq v1, v3, :cond_f

    .line 242
    .line 243
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->w:Lcom/google/android/gms/internal/clearcut/s;

    .line 244
    .line 245
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 246
    .line 247
    if-eq v1, v3, :cond_f

    .line 248
    .line 249
    sget-object v3, Lcom/google/android/gms/internal/clearcut/s;->x:Lcom/google/android/gms/internal/clearcut/s;

    .line 250
    .line 251
    iget v3, v3, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 252
    .line 253
    if-ne v1, v3, :cond_d

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_d
    iget v2, v5, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 257
    .line 258
    if-ne v1, v2, :cond_e

    .line 259
    .line 260
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->A:Ljava/lang/Object;

    .line 265
    .line 266
    iget v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->t:I

    .line 267
    .line 268
    and-int/lit16 v1, v1, 0x800

    .line 269
    .line 270
    if-eqz v1, :cond_e

    .line 271
    .line 272
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->z:Ljava/lang/Object;

    .line 277
    .line 278
    :cond_e
    return v8

    .line 279
    :cond_f
    :goto_3
    and-int/lit8 v1, v2, 0x1

    .line 280
    .line 281
    if-ne v1, v8, :cond_10

    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->z:Ljava/lang/Object;

    .line 288
    .line 289
    :cond_10
    return v8

    .line 290
    :cond_11
    :goto_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/Y;->c()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->y:Ljava/lang/Object;

    .line 295
    .line 296
    return v8

    .line 297
    :cond_12
    :goto_5
    iget-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->x:Ljava/lang/reflect/Field;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/Y;->y:Ljava/lang/Object;

    .line 304
    .line 305
    return v8

    .line 306
    :cond_13
    const/4 v1, 0x0

    .line 307
    return v1
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/clearcut/Y;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->n:I

    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/Y;->b:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0
.end method
