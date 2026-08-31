.class public final Le3/s;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:La3/k;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public constructor <init>(La3/k;Landroid/content/Context;Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/s;->q:La3/k;

    .line 2
    .line 3
    iput-object p2, p0, Le3/s;->r:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Le3/s;->s:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, Le3/s;

    .line 2
    .line 3
    iget-object v0, p0, Le3/s;->r:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Le3/s;->s:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Le3/s;->q:La3/k;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Le3/s;-><init>(La3/k;Landroid/content/Context;Ljava/lang/String;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Le3/s;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Le3/s;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Le3/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Le3/s;->q:La3/k;

    .line 5
    .line 6
    invoke-virtual {p1}, La3/k;->c()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La3/A;

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, La3/A;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, v0, La3/A;->f:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    const/16 v3, 0xa0

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string v2, "data:"

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static {v1, v2, v5}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    const-string v2, "base64,"

    .line 55
    .line 56
    const/4 v6, 0x6

    .line 57
    invoke-static {v1, v2, v5, v6}, LJ5/m;->S0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-lez v2, :cond_2

    .line 62
    .line 63
    const/16 v2, 0x2c

    .line 64
    .line 65
    :try_start_0
    invoke-static {v1, v2, v5, v6}, LJ5/m;->R0(Ljava/lang/CharSequence;CII)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/2addr v2, v4

    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v6, "substring(...)"

    .line 75
    .line 76
    invoke-static {v2, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    .line 84
    .line 85
    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-boolean v4, v6, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 89
    .line 90
    iput v3, v6, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 91
    .line 92
    array-length v7, v2

    .line 93
    invoke-static {v2, v5, v7, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iput-object v2, v0, La3/A;->f:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catch_0
    move-exception v2

    .line 101
    const-string v5, "data URL did not have correct base64 format."

    .line 102
    .line 103
    invoke-static {v5, v2}, Ln3/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_1
    iget-object v2, p0, Le3/s;->r:Landroid/content/Context;

    .line 107
    .line 108
    iget-object v5, v0, La3/A;->f:Landroid/graphics/Bitmap;

    .line 109
    .line 110
    if-nez v5, :cond_0

    .line 111
    .line 112
    iget-object v5, p0, Le3/s;->s:Ljava/lang/String;

    .line 113
    .line 114
    if-nez v5, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v6, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v2, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 137
    .line 138
    .line 139
    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 140
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    :try_start_2
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    .line 145
    .line 146
    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-boolean v4, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 150
    .line 151
    iput v3, v5, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 152
    .line 153
    invoke-static {v1, v2, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 154
    .line 155
    .line 156
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 157
    goto :goto_2

    .line 158
    :catch_1
    move-exception v1

    .line 159
    const-string v3, "Unable to decode image."

    .line 160
    .line 161
    invoke-static {v3, v1}, Ln3/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    if-eqz v2, :cond_0

    .line 165
    .line 166
    iget v1, v0, La3/A;->a:I

    .line 167
    .line 168
    iget v3, v0, La3/A;->b:I

    .line 169
    .line 170
    invoke-static {v2, v1, v3}, Ln3/i;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iput-object v1, v0, La3/A;->f:Landroid/graphics/Bitmap;

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :catch_2
    move-exception v0

    .line 179
    const-string v1, "Unable to open asset."

    .line 180
    .line 181
    invoke-static {v1, v0}, Ln3/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 187
    .line 188
    return-object p1
.end method
