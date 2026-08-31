.class public Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final zza:Lt3/a;

.field private zzb:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzb:Z

    .line 6
    .line 7
    new-instance v0, Lt3/a;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lt3/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zza:Lt3/a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final zza(ILcom/google/android/gms/internal/vision/E;)V
    .locals 6

    .line 1
    const-string v0, "Would have logged:\n"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/vision/e0;->h()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    new-instance v3, Lcom/google/android/gms/internal/vision/Q;

    .line 13
    .line 14
    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/internal/vision/Q;-><init>(I[B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v4, Lcom/google/android/gms/internal/vision/I0;->c:Lcom/google/android/gms/internal/vision/I0;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/vision/I0;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/L0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, v3, Lcom/google/android/gms/internal/vision/Q;->b:Lcom/google/android/gms/internal/vision/w0;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v5, Lcom/google/android/gms/internal/vision/w0;

    .line 39
    .line 40
    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/vision/w0;-><init>(Lcom/google/android/gms/internal/vision/Q;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface {v4, p2, v5}, Lcom/google/android/gms/internal/vision/L0;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/google/android/gms/internal/vision/Q;->F()I

    .line 47
    .line 48
    .line 49
    move-result p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 50
    if-nez p2, :cond_7

    .line 51
    .line 52
    if-ltz p1, :cond_5

    .line 53
    .line 54
    const/4 p2, 0x3

    .line 55
    if-le p1, p2, :cond_1

    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    const/4 p2, 0x0

    .line 60
    :try_start_1
    iget-boolean v3, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzb:Z

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zza:Lt3/a;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v1, LB0/f0;

    .line 70
    .line 71
    invoke-direct {v1, v0, v2}, LB0/f0;-><init>(Lt3/a;[B)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v1, LB0/f0;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lcom/google/android/gms/internal/clearcut/w0;

    .line 77
    .line 78
    iput p1, v0, Lcom/google/android/gms/internal/clearcut/w0;->s:I

    .line 79
    .line 80
    invoke-virtual {v1}, LB0/f0;->b()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catch_0
    move-exception p1

    .line 85
    goto :goto_5

    .line 86
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/E;->k()Lcom/google/android/gms/internal/vision/D;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    :try_start_2
    sget-object v3, Lcom/google/android/gms/internal/vision/U;->b:Lcom/google/android/gms/internal/vision/U;

    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    const-class v3, Lcom/google/android/gms/internal/vision/U;

    .line 96
    .line 97
    monitor-enter v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 98
    :try_start_3
    sget-object v4, Lcom/google/android/gms/internal/vision/U;->b:Lcom/google/android/gms/internal/vision/U;

    .line 99
    .line 100
    if-eqz v4, :cond_4

    .line 101
    .line 102
    monitor-exit v3

    .line 103
    :goto_1
    move-object v3, v4

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/vision/Z;->a()Lcom/google/android/gms/internal/vision/U;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    sput-object v4, Lcom/google/android/gms/internal/vision/U;->b:Lcom/google/android/gms/internal/vision/U;

    .line 112
    .line 113
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 114
    goto :goto_1

    .line 115
    :goto_2
    :try_start_4
    invoke-virtual {p1, v2, v1, v3}, Lcom/google/android/gms/internal/vision/c0;->c([BILcom/google/android/gms/internal/vision/U;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string v1, "Vision"

    .line 123
    .line 124
    const/4 v2, 0x6

    .line 125
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_6

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :catch_1
    move-exception p1

    .line 148
    goto :goto_4

    .line 149
    :goto_3
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 150
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 151
    :goto_4
    :try_start_7
    const-string v0, "Parsing error"

    .line 152
    .line 153
    new-array v1, p2, [Ljava/lang/Object;

    .line 154
    .line 155
    invoke-static {p1, v0, v1}, LE3/h;->z(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :goto_5
    sget-object v0, Lcom/google/android/gms/internal/vision/b;->a:Lcom/google/android/gms/internal/vision/d0;

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/d0;->q(Ljava/lang/Exception;)V

    .line 162
    .line 163
    .line 164
    const-string v0, "Failed to log"

    .line 165
    .line 166
    new-array p2, p2, [Ljava/lang/Object;

    .line 167
    .line 168
    invoke-static {p1, v0, p2}, LE3/h;->z(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_5
    :goto_6
    const-string p2, "Illegal event code: %d"

    .line 173
    .line 174
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string v0, "Vision"

    .line 183
    .line 184
    const/4 v1, 0x4

    .line 185
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_6

    .line 190
    .line 191
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    :cond_6
    :goto_7
    return-void

    .line 199
    :cond_7
    :try_start_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    const-string p2, "Did not write as much data as expected."

    .line 202
    .line 203
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 207
    :catch_2
    move-exception p1

    .line 208
    new-instance p2, Ljava/lang/RuntimeException;

    .line 209
    .line 210
    const-class v0, Lcom/google/android/gms/internal/vision/E;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    add-int/lit8 v1, v1, 0x48

    .line 221
    .line 222
    new-instance v2, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 225
    .line 226
    .line 227
    const-string v1, "Serializing "

    .line 228
    .line 229
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v0, " to a byte array threw an IOException (should never happen)."

    .line 236
    .line 237
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    throw p2
.end method
