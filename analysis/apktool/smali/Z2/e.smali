.class public final LZ2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZ2/f;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(LZ2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ2/e;->a:LZ2/f;

    .line 5
    .line 6
    iput-object p2, p0, LZ2/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LZ2/e;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LZ2/e;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, LZ2/e;->e:Ljava/util/Map;

    .line 13
    .line 14
    iput-object p6, p0, LZ2/e;->f:Ljava/util/HashMap;

    .line 15
    .line 16
    iput-object p7, p0, LZ2/e;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, LZ2/e;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p9, p0, LZ2/e;->i:Z

    .line 21
    .line 22
    iput-boolean p10, p0, LZ2/e;->j:Z

    .line 23
    .line 24
    iput-boolean p11, p0, LZ2/e;->k:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, LZ2/e;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, LZ2/e;

    .line 12
    .line 13
    iget-object v0, p0, LZ2/e;->a:LZ2/f;

    .line 14
    .line 15
    iget-object v1, p1, LZ2/e;->a:LZ2/f;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, LZ2/e;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, LZ2/e;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, LZ2/e;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p1, LZ2/e;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v0, p0, LZ2/e;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, LZ2/e;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-object v0, p0, LZ2/e;->e:Ljava/util/Map;

    .line 55
    .line 56
    iget-object v1, p1, LZ2/e;->e:Ljava/util/Map;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, LZ2/e;->f:Ljava/util/HashMap;

    .line 66
    .line 67
    iget-object v1, p1, LZ2/e;->f:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, LZ2/e;->g:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p1, LZ2/e;->g:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object v0, p0, LZ2/e;->h:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v1, p1, LZ2/e;->h:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-boolean v0, p0, LZ2/e;->i:Z

    .line 99
    .line 100
    iget-boolean v1, p1, LZ2/e;->i:Z

    .line 101
    .line 102
    if-eq v0, v1, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-boolean v0, p0, LZ2/e;->j:Z

    .line 106
    .line 107
    iget-boolean v1, p1, LZ2/e;->j:Z

    .line 108
    .line 109
    if-eq v0, v1, :cond_b

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_b
    iget-boolean v0, p0, LZ2/e;->k:Z

    .line 113
    .line 114
    iget-boolean p1, p1, LZ2/e;->k:Z

    .line 115
    .line 116
    if-eq v0, p1, :cond_c

    .line 117
    .line 118
    :goto_0
    const/4 p1, 0x0

    .line 119
    return p1

    .line 120
    :cond_c
    :goto_1
    const/4 p1, 0x1

    .line 121
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, LZ2/e;->a:LZ2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, LZ2/e;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, LC0/S;->h(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, LZ2/e;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, LC0/S;->h(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, LZ2/e;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, LC0/S;->h(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, LZ2/e;->e:Ljava/util/Map;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, LZ2/e;->f:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, LZ2/e;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, LC0/S;->h(Ljava/lang/String;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, LZ2/e;->h:Ljava/lang/String;

    .line 51
    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    :goto_0
    add-int/2addr v0, v2

    .line 61
    mul-int/2addr v0, v1

    .line 62
    iget-boolean v2, p0, LZ2/e;->i:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, Lk1/i;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean v2, p0, LZ2/e;->j:Z

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, Lk1/i;->e(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v1, p0, LZ2/e;->k:Z

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    add-int/2addr v1, v0

    .line 81
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, LZ2/e;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Ljava/lang/Iterable;

    .line 9
    .line 10
    new-instance v5, LI5/m;

    .line 11
    .line 12
    const/16 v0, 0x1b

    .line 13
    .line 14
    invoke-direct {v5, v0}, LI5/m;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v6, 0x1c

    .line 18
    .line 19
    const-string v2, "\n"

    .line 20
    .line 21
    const-string v3, "\n"

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Ln5/l;->q0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;LB5/c;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, LZ2/e;->e:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, Ljava/lang/Iterable;

    .line 36
    .line 37
    new-instance v6, LI5/m;

    .line 38
    .line 39
    const/16 v1, 0x1c

    .line 40
    .line 41
    invoke-direct {v6, v1}, LI5/m;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const/16 v7, 0x1c

    .line 45
    .line 46
    const-string v3, "\n"

    .line 47
    .line 48
    const-string v4, "\n"

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static/range {v2 .. v7}, Ln5/l;->q0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;LB5/c;I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, LJ5/g;

    .line 56
    .line 57
    iget-object v3, p0, LZ2/e;->g:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {v2, v3}, LJ5/g;-><init>(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, LJ5/g;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_0

    .line 67
    .line 68
    sget-object v2, Ln5/s;->q:Ln5/s;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    invoke-virtual {v2}, LJ5/g;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2}, LJ5/g;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_1

    .line 80
    .line 81
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :goto_0
    invoke-virtual {v2}, LJ5/g;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    invoke-virtual {v2}, LJ5/g;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    move-object v2, v4

    .line 109
    :goto_1
    check-cast v2, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-static {v2}, Ln5/l;->i0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    move-object v3, v2

    .line 116
    check-cast v3, Ljava/lang/Iterable;

    .line 117
    .line 118
    new-instance v7, LI5/m;

    .line 119
    .line 120
    const/16 v2, 0x1d

    .line 121
    .line 122
    invoke-direct {v7, v2}, LI5/m;-><init>(I)V

    .line 123
    .line 124
    .line 125
    const/16 v8, 0x1c

    .line 126
    .line 127
    const-string v4, "\n"

    .line 128
    .line 129
    const-string v5, "\n"

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    invoke-static/range {v3 .. v8}, Ln5/l;->q0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;LB5/c;I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v4, "\n  Type: "

    .line 139
    .line 140
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, p0, LZ2/e;->a:LZ2/f;

    .line 144
    .line 145
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v4, "\n  URL: "

    .line 149
    .line 150
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    iget-object v4, p0, LZ2/e;->b:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v4, "\n  Method: "

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v4, "\n  Body: "

    .line 164
    .line 165
    const-string v5, "\n  Headers: "

    .line 166
    .line 167
    iget-object v6, p0, LZ2/e;->c:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v7, p0, LZ2/e;->d:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v3, v6, v4, v7, v5}, Lk1/i;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v4, "\n  FormParameters: "

    .line 175
    .line 176
    const-string v5, "\n  Trace: "

    .line 177
    .line 178
    invoke-static {v3, v0, v4, v1, v5}, Lk1/i;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v0, "\n  Encoding type (form submissions only): "

    .line 182
    .line 183
    const-string v1, "\n  Is for main frame? "

    .line 184
    .line 185
    iget-object v4, p0, LZ2/e;->h:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v3, v2, v0, v4, v1}, Lk1/i;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-boolean v0, p0, LZ2/e;->i:Z

    .line 191
    .line 192
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v0, "\n  Is redirect? "

    .line 196
    .line 197
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    iget-boolean v0, p0, LZ2/e;->j:Z

    .line 201
    .line 202
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v0, "\n  Has gesture? "

    .line 206
    .line 207
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    iget-boolean v0, p0, LZ2/e;->k:Z

    .line 211
    .line 212
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v0, "\n        "

    .line 216
    .line 217
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    return-object v0
.end method
