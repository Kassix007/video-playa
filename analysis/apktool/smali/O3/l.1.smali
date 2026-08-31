.class public final LO3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Lw0/c;

    invoke-direct {v0}, Lw0/c;-><init>()V

    iput-object v0, p0, LO3/l;->b:Ljava/lang/Object;

    .line 10
    new-instance v0, Lw0/c;

    invoke-direct {v0}, Lw0/c;-><init>()V

    iput-object v0, p0, LO3/l;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/n;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/l;->c:Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lx3/A;->d(Ljava/lang/String;)V

    iput-object p2, p0, LO3/l;->b:Ljava/lang/Object;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LO3/l;->a:J

    return-void
.end method

.method public constructor <init>(LO3/n;Ljava/lang/String;J)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/l;->c:Ljava/lang/Object;

    .line 4
    invoke-static {p2}, Lx3/A;->d(Ljava/lang/String;)V

    iput-object p2, p0, LO3/l;->b:Ljava/lang/Object;

    .line 5
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    .line 6
    const-string p3, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1"

    const-wide/16 v0, -0x1

    invoke-virtual {p1, p3, p2, v0, v1}, LO3/n;->L(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide p1

    .line 7
    iput-wide p1, p0, LO3/l;->a:J

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LO3/l;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, LO3/n;

    .line 7
    .line 8
    new-instance v3, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, LO3/l;->b:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    iget-wide v5, v1, LO3/l;->a:J

    .line 19
    .line 20
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    const-string v8, "app_id = ? and rowid > ?"

    .line 29
    .line 30
    const-string v13, "1000"

    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    :try_start_0
    invoke-virtual {v2}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "raw_events"

    .line 38
    .line 39
    const-string v15, "rowid"

    .line 40
    .line 41
    const-string v16, "name"

    .line 42
    .line 43
    const-string v17, "timestamp"

    .line 44
    .line 45
    const-string v18, "metadata_fingerprint"

    .line 46
    .line 47
    const-string v19, "data"

    .line 48
    .line 49
    const-string v20, "realtime"

    .line 50
    .line 51
    filled-new-array/range {v15 .. v20}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const-string v12, "rowid"

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    invoke-virtual/range {v5 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    :cond_0
    const/4 v0, 0x0

    .line 70
    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    const/4 v5, 0x3

    .line 75
    invoke-interface {v14, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    const/4 v5, 0x5

    .line 80
    invoke-interface {v14, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v10

    .line 84
    const-wide/16 v12, 0x1

    .line 85
    .line 86
    cmp-long v5, v10, v12

    .line 87
    .line 88
    const/4 v10, 0x1

    .line 89
    if-nez v5, :cond_1

    .line 90
    .line 91
    move v0, v10

    .line 92
    :cond_1
    const/4 v5, 0x4

    .line 93
    invoke-interface {v14, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    iget-wide v11, v1, LO3/l;->a:J

    .line 98
    .line 99
    cmp-long v11, v6, v11

    .line 100
    .line 101
    if-lez v11, :cond_2

    .line 102
    .line 103
    iput-wide v6, v1, LO3/l;->a:J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k1;->z()Lcom/google/android/gms/internal/measurement/j1;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-static {v11, v5}, LO3/b0;->b0(Lcom/google/android/gms/internal/measurement/p2;[B)Lcom/google/android/gms/internal/measurement/p2;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Lcom/google/android/gms/internal/measurement/j1;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    :try_start_2
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-nez v10, :cond_3

    .line 120
    .line 121
    const-string v10, ""

    .line 122
    .line 123
    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/p2;->b()V

    .line 124
    .line 125
    .line 126
    iget-object v11, v5, Lcom/google/android/gms/internal/measurement/p2;->r:Lcom/google/android/gms/internal/measurement/q2;

    .line 127
    .line 128
    check-cast v11, Lcom/google/android/gms/internal/measurement/k1;

    .line 129
    .line 130
    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/measurement/k1;->F(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/4 v10, 0x2

    .line 134
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/p2;->b()V

    .line 139
    .line 140
    .line 141
    iget-object v12, v5, Lcom/google/android/gms/internal/measurement/p2;->r:Lcom/google/android/gms/internal/measurement/q2;

    .line 142
    .line 143
    check-cast v12, Lcom/google/android/gms/internal/measurement/k1;

    .line 144
    .line 145
    invoke-virtual {v12, v10, v11}, Lcom/google/android/gms/internal/measurement/k1;->G(J)V

    .line 146
    .line 147
    .line 148
    move-object v10, v5

    .line 149
    new-instance v5, LO3/k;

    .line 150
    .line 151
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/p2;->e()Lcom/google/android/gms/internal/measurement/q2;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    move-object v11, v10

    .line 156
    check-cast v11, Lcom/google/android/gms/internal/measurement/k1;

    .line 157
    .line 158
    move v10, v0

    .line 159
    invoke-direct/range {v5 .. v11}, LO3/k;-><init>(JJZLcom/google/android/gms/internal/measurement/k1;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    goto :goto_3

    .line 168
    :catch_0
    move-exception v0

    .line 169
    goto :goto_1

    .line 170
    :catch_1
    move-exception v0

    .line 171
    iget-object v5, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v5, LO3/t0;

    .line 174
    .line 175
    iget-object v5, v5, LO3/t0;->v:LO3/X;

    .line 176
    .line 177
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 178
    .line 179
    .line 180
    iget-object v5, v5, LO3/X;->w:LO3/V;

    .line 181
    .line 182
    const-string v6, "Data loss. Failed to merge raw event. appId"

    .line 183
    .line 184
    invoke-static {v4}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-virtual {v5, v7, v0, v6}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :goto_0
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_0

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_4
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :goto_1
    :try_start_3
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, LO3/t0;

    .line 204
    .line 205
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 206
    .line 207
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 208
    .line 209
    .line 210
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 211
    .line 212
    const-string v5, "Data loss. Error querying raw events batch. appId"

    .line 213
    .line 214
    invoke-static {v4}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-virtual {v2, v4, v0, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 219
    .line 220
    .line 221
    :goto_2
    if-eqz v14, :cond_5

    .line 222
    .line 223
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 224
    .line 225
    .line 226
    :cond_5
    return-object v3

    .line 227
    :goto_3
    if-eqz v14, :cond_6

    .line 228
    .line 229
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 230
    .line 231
    .line 232
    :cond_6
    throw v0
.end method
