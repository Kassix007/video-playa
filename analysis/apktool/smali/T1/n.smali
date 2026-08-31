.class public final LT1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:LJ5/k;

.field public static final n:LJ5/k;

.field public static final o:LJ5/k;

.field public static final p:LJ5/k;

.field public static final q:LJ5/k;

.field public static final r:LJ5/k;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/lang/String;

.field public final d:Lm5/o;

.field public final e:Lm5/o;

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Lm5/o;

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ5/k;

    .line 2
    .line 3
    const-string v1, "^[a-zA-Z]+[+\\w\\-.]*:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LT1/n;->m:LJ5/k;

    .line 9
    .line 10
    new-instance v0, LJ5/k;

    .line 11
    .line 12
    const-string v1, "\\{(.+?)\\}"

    .line 13
    .line 14
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LT1/n;->n:LJ5/k;

    .line 18
    .line 19
    new-instance v0, LJ5/k;

    .line 20
    .line 21
    const-string v1, "http[s]?://"

    .line 22
    .line 23
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, LT1/n;->o:LJ5/k;

    .line 27
    .line 28
    new-instance v0, LJ5/k;

    .line 29
    .line 30
    const-string v1, ".*"

    .line 31
    .line 32
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LT1/n;->p:LJ5/k;

    .line 36
    .line 37
    new-instance v0, LJ5/k;

    .line 38
    .line 39
    const-string v1, "([^/]*?|)"

    .line 40
    .line 41
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, LT1/n;->q:LJ5/k;

    .line 45
    .line 46
    new-instance v0, LJ5/k;

    .line 47
    .line 48
    const-string v1, "^[^?#]+\\?([^#]*).*"

    .line 49
    .line 50
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, LT1/n;->r:LJ5/k;

    .line 54
    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT1/n;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LT1/n;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, LT1/k;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, v2}, LT1/k;-><init>(LT1/n;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, LT1/n;->d:Lm5/o;

    .line 24
    .line 25
    new-instance v1, LT1/k;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v1, p0, v2}, LT1/k;-><init>(LT1/n;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, LT1/n;->e:Lm5/o;

    .line 36
    .line 37
    new-instance v1, LT1/k;

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-direct {v1, p0, v2}, LT1/k;-><init>(LT1/n;I)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lm5/i;->r:Lm5/i;

    .line 44
    .line 45
    invoke-static {v2, v1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, p0, LT1/n;->f:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance v1, LT1/k;

    .line 52
    .line 53
    const/4 v3, 0x3

    .line 54
    invoke-direct {v1, p0, v3}, LT1/k;-><init>(LT1/n;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, LT1/n;->h:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v1, LT1/k;

    .line 64
    .line 65
    const/4 v3, 0x4

    .line 66
    invoke-direct {v1, p0, v3}, LT1/k;-><init>(LT1/n;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, LT1/n;->i:Ljava/lang/Object;

    .line 74
    .line 75
    new-instance v1, LT1/k;

    .line 76
    .line 77
    const/4 v3, 0x5

    .line 78
    invoke-direct {v1, p0, v3}, LT1/k;-><init>(LT1/n;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, LT1/n;->j:Ljava/lang/Object;

    .line 86
    .line 87
    new-instance v1, LT1/k;

    .line 88
    .line 89
    const/4 v2, 0x6

    .line 90
    invoke-direct {v1, p0, v2}, LT1/k;-><init>(LT1/n;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, LT1/n;->k:Lm5/o;

    .line 98
    .line 99
    new-instance v1, LT1/k;

    .line 100
    .line 101
    const/4 v2, 0x7

    .line 102
    invoke-direct {v1, p0, v2}, LT1/k;-><init>(LT1/n;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 106
    .line 107
    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v2, "^"

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v2, LT1/n;->m:LJ5/k;

    .line 116
    .line 117
    iget-object v2, v2, LJ5/k;->q:Ljava/util/regex/Pattern;

    .line 118
    .line 119
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_0

    .line 128
    .line 129
    sget-object v2, LT1/n;->o:LJ5/k;

    .line 130
    .line 131
    iget-object v2, v2, LJ5/k;->q:Ljava/util/regex/Pattern;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const-string v3, "pattern(...)"

    .line 138
    .line 139
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :cond_0
    new-instance v2, LJ5/k;

    .line 146
    .line 147
    const-string v3, "(\\?|#|$)"

    .line 148
    .line 149
    invoke-direct {v2, v3}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v2, p1}, LJ5/k;->a(LJ5/k;Ljava/lang/String;)LB0/G0;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-eqz v2, :cond_2

    .line 157
    .line 158
    invoke-virtual {v2}, LB0/G0;->D()LG5/d;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget v2, v2, LG5/b;->q:I

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-string v2, "substring(...)"

    .line 170
    .line 171
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v0, v1}, LT1/n;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 175
    .line 176
    .line 177
    sget-object p1, LT1/n;->p:LJ5/k;

    .line 178
    .line 179
    iget-object p1, p1, LJ5/k;->q:Ljava/util/regex/Pattern;

    .line 180
    .line 181
    invoke-virtual {p1, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_1

    .line 190
    .line 191
    sget-object p1, LT1/n;->q:LJ5/k;

    .line 192
    .line 193
    iget-object p1, p1, LJ5/k;->q:Ljava/util/regex/Pattern;

    .line 194
    .line 195
    invoke-virtual {p1, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-nez p1, :cond_1

    .line 204
    .line 205
    const/4 v3, 0x1

    .line 206
    :cond_1
    iput-boolean v3, p0, LT1/n;->l:Z

    .line 207
    .line 208
    const-string p1, "($|(\\?(.)*)|(#(.)*))"

    .line 209
    .line 210
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-string v0, "toString(...)"

    .line 218
    .line 219
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-static {p1}, LT1/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    iput-object p1, p0, LT1/n;->c:Ljava/lang/String;

    .line 227
    .line 228
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V
    .locals 6

    .line 1
    sget-object v0, LT1/n;->n:LJ5/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, LJ5/k;->a(LJ5/k;Ljava/lang/String;)LB0/G0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    const-string v2, "quote(...)"

    .line 9
    .line 10
    const-string v3, "substring(...)"

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v4, v0, LB0/G0;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, LJ5/j;

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    invoke-virtual {v4, v5}, LJ5/j;->g(I)LJ5/h;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v4, LJ5/h;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, LB0/G0;->D()LG5/d;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v4, v4, LG5/b;->q:I

    .line 36
    .line 37
    if-le v4, v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, LB0/G0;->D()LG5/d;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget v4, v4, LG5/b;->q:I

    .line 44
    .line 45
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_0
    sget-object v1, LT1/n;->q:LJ5/k;

    .line 63
    .line 64
    iget-object v1, v1, LJ5/k;->q:Ljava/util/regex/Pattern;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v2, "pattern(...)"

    .line 71
    .line 72
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, LB0/G0;->D()LG5/d;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget v1, v1, LG5/b;->r:I

    .line 83
    .line 84
    add-int/2addr v1, v5

    .line 85
    invoke-virtual {v0}, LB0/G0;->M()LB0/G0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-ge v1, p1, :cond_2

    .line 95
    .line 96
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    :cond_2
    return-void
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "\\Q"

    .line 2
    .line 3
    invoke-static {p0, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, ".*"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "\\E"

    .line 12
    .line 13
    invoke-static {p0, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "\\E.*\\Q"

    .line 20
    .line 21
    invoke-static {p0, v1, v0}, LJ5/t;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    const-string v0, "\\.\\*"

    .line 27
    .line 28
    invoke-static {p0, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-static {p0, v0, v1}, LJ5/t;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/net/Uri;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LT1/n;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "parse(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast p1, Ljava/lang/Iterable;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Iterable;

    .line 25
    .line 26
    const-string v1, "<this>"

    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, "other"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    instance-of v1, p1, Ljava/util/Collection;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    check-cast p1, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-direct {v1, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v1}, Ln5/l;->z0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    instance-of p1, v0, Ljava/util/Collection;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    check-cast v0, Ljava/util/Collection;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-static {v0}, Ln5/l;->B0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    move-object v0, p1

    .line 68
    check-cast v0, Ljava/util/Collection;

    .line 69
    .line 70
    :goto_1
    invoke-interface {v1, v0}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :cond_2
    const/4 p1, 0x0

    .line 79
    return p1
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p0, LT1/n;->f:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, LT1/m;

    .line 35
    .line 36
    iget-object v2, v2, LT1/m;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-static {v1, v2}, Ln5/q;->e0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p0, LT1/n;->b:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-static {v0, v1}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, LT1/n;->i:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/util/List;

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-static {v0, v1}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public final d(Landroid/net/Uri;Ljava/util/LinkedHashMap;)Landroid/os/Bundle;
    .locals 8

    .line 1
    const-string v0, "deepLink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arguments"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LT1/n;->d:Lm5/o;

    .line 12
    .line 13
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LJ5/k;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_a

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, LJ5/k;->b(Ljava/lang/String;)LB0/G0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    new-array v3, v2, [Lm5/j;

    .line 36
    .line 37
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, [Lm5/j;

    .line 42
    .line 43
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {p0, v0, v3, p2}, LT1/n;->e(LB0/G0;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, LT1/n;->e:Lm5/o;

    .line 56
    .line 57
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, p1, v3, p2}, LT1/n;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v0, p0, LT1/n;->k:Lm5/o;

    .line 82
    .line 83
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, LJ5/k;

    .line 88
    .line 89
    if-eqz v0, :cond_8

    .line 90
    .line 91
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v0, p1}, LJ5/k;->b(Ljava/lang/String;)LB0/G0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-nez p1, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    iget-object v0, p0, LT1/n;->i:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/util/List;

    .line 109
    .line 110
    check-cast v0, Ljava/lang/Iterable;

    .line 111
    .line 112
    new-instance v4, Ljava/util/ArrayList;

    .line 113
    .line 114
    const/16 v5, 0xa

    .line 115
    .line 116
    invoke-static {v0, v5}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_8

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    add-int/lit8 v6, v2, 0x1

    .line 138
    .line 139
    if-ltz v2, :cond_7

    .line 140
    .line 141
    check-cast v5, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v2, p1, LB0/G0;->t:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, LJ5/j;

    .line 146
    .line 147
    invoke-virtual {v2, v6}, LJ5/j;->g(I)LJ5/h;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-eqz v2, :cond_4

    .line 152
    .line 153
    iget-object v2, v2, LJ5/h;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    const-string v7, "decode(...)"

    .line 160
    .line 161
    invoke-static {v2, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    move-object v2, v1

    .line 166
    :goto_1
    if-nez v2, :cond_5

    .line 167
    .line 168
    const-string v2, ""

    .line 169
    .line 170
    :cond_5
    invoke-virtual {p2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    if-nez v7, :cond_6

    .line 175
    .line 176
    :try_start_0
    invoke-static {v5, v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->I(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 180
    .line 181
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move v2, v6

    .line 185
    goto :goto_0

    .line 186
    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    .line 187
    .line 188
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n2;->N()V

    .line 193
    .line 194
    .line 195
    throw v1

    .line 196
    :catch_0
    :cond_8
    :goto_2
    new-instance p1, LT1/l;

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-direct {p1, v0, v3}, LT1/l;-><init>(ILandroid/os/Bundle;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/n2;->B(Ljava/util/Map;LB5/c;)Ljava/util/ArrayList;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-nez p1, :cond_9

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_9
    return-object v3

    .line 214
    :cond_a
    :goto_3
    return-object v1
.end method

.method public final e(LB0/G0;Landroid/os/Bundle;Ljava/util/Map;)Z
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object v2, p0, LT1/n;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v2, v1}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v5, v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    add-int/lit8 v7, v4, 0x1

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    if-ltz v4, :cond_3

    .line 33
    .line 34
    check-cast v6, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, p1, LB0/G0;->t:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, LJ5/j;

    .line 39
    .line 40
    invoke-virtual {v4, v7}, LJ5/j;->g(I)LJ5/h;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    iget-object v4, v4, LJ5/h;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v4}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    const-string v4, "decode(...)"

    .line 53
    .line 54
    invoke-static {v8, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    if-nez v8, :cond_1

    .line 58
    .line 59
    const-string v8, ""

    .line 60
    .line 61
    :cond_1
    invoke-interface {p3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-nez v4, :cond_2

    .line 66
    .line 67
    :try_start_0
    invoke-static {v6, v8, p2}, Lcom/google/android/gms/internal/measurement/P1;->I(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 71
    .line 72
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move v4, v7

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    return v3

    .line 78
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n2;->N()V

    .line 85
    .line 86
    .line 87
    throw v8

    .line 88
    :cond_4
    const/4 p1, 0x1

    .line 89
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, LT1/n;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p1, LT1/n;

    .line 9
    .line 10
    iget-object p1, p1, LT1/n;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, LT1/n;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, LT1/n;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_d

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, LT1/m;

    .line 44
    .line 45
    move-object/from16 v6, p1

    .line 46
    .line 47
    invoke-virtual {v6, v5}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-boolean v7, v0, LT1/n;->g:Z

    .line 52
    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    if-eqz v7, :cond_0

    .line 60
    .line 61
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-nez v8, :cond_0

    .line 70
    .line 71
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    :cond_0
    sget-object v7, Lm5/y;->a:Lm5/y;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    new-array v9, v8, [Lm5/j;

    .line 79
    .line 80
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    check-cast v9, [Lm5/j;

    .line 85
    .line 86
    invoke-static {v9}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    iget-object v10, v3, LT1/m;->b:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    move v12, v8

    .line 97
    :goto_1
    if-ge v12, v11, :cond_2

    .line 98
    .line 99
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    add-int/lit8 v12, v12, 0x1

    .line 104
    .line 105
    check-cast v13, Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    if-nez v13, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    new-instance v1, Ljava/lang/ClassCastException;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 117
    .line 118
    .line 119
    throw v1

    .line 120
    :cond_2
    check-cast v5, Ljava/lang/Iterable;

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    if-eqz v10, :cond_c

    .line 131
    .line 132
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    check-cast v10, Ljava/lang/String;

    .line 137
    .line 138
    iget-object v11, v3, LT1/m;->a:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v11, :cond_4

    .line 141
    .line 142
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    const-string v13, "compile(...)"

    .line 147
    .line 148
    invoke-static {v11, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-string v13, "input"

    .line 152
    .line 153
    invoke-static {v10, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v11, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    const-string v13, "matcher(...)"

    .line 161
    .line 162
    invoke-static {v11, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    if-nez v13, :cond_3

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_3
    new-instance v13, LB0/G0;

    .line 173
    .line 174
    invoke-direct {v13, v11, v10}, LB0/G0;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_4
    :goto_3
    const/4 v13, 0x0

    .line 179
    :goto_4
    if-nez v13, :cond_5

    .line 180
    .line 181
    return v8

    .line 182
    :cond_5
    iget-object v10, v3, LT1/m;->b:Ljava/util/ArrayList;

    .line 183
    .line 184
    new-instance v11, Ljava/util/ArrayList;

    .line 185
    .line 186
    const/16 v14, 0xa

    .line 187
    .line 188
    invoke-static {v10, v14}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    move v4, v8

    .line 200
    move v15, v4

    .line 201
    const/16 v16, 0x1

    .line 202
    .line 203
    :goto_5
    if-ge v4, v14, :cond_b

    .line 204
    .line 205
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v17

    .line 209
    add-int/lit8 v4, v4, 0x1

    .line 210
    .line 211
    add-int/lit8 v8, v15, 0x1

    .line 212
    .line 213
    if-ltz v15, :cond_a

    .line 214
    .line 215
    move-object/from16 v15, v17

    .line 216
    .line 217
    check-cast v15, Ljava/lang/String;

    .line 218
    .line 219
    const/16 v17, 0x0

    .line 220
    .line 221
    iget-object v12, v13, LB0/G0;->t:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v12, LJ5/j;

    .line 224
    .line 225
    invoke-virtual {v12, v8}, LJ5/j;->g(I)LJ5/h;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    if-eqz v12, :cond_6

    .line 230
    .line 231
    iget-object v12, v12, LJ5/h;->a:Ljava/lang/String;

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_6
    move-object/from16 v12, v17

    .line 235
    .line 236
    :goto_6
    if-nez v12, :cond_7

    .line 237
    .line 238
    const-string v12, ""

    .line 239
    .line 240
    :cond_7
    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v18

    .line 244
    if-nez v18, :cond_9

    .line 245
    .line 246
    :try_start_0
    const-string v0, "key"

    .line 247
    .line 248
    invoke-static {v15, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_8

    .line 256
    .line 257
    invoke-static {v15, v12, v9}, Lcom/google/android/gms/internal/measurement/P1;->I(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_8
    invoke-virtual {v9, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    xor-int/lit8 v0, v0, 0x1

    .line 266
    .line 267
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 268
    .line 269
    .line 270
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    goto :goto_8

    .line 272
    :catch_0
    :goto_7
    move-object v0, v7

    .line 273
    :goto_8
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-object/from16 v0, p0

    .line 277
    .line 278
    move v15, v8

    .line 279
    const/4 v8, 0x0

    .line 280
    goto :goto_5

    .line 281
    :cond_9
    new-instance v0, Ljava/lang/ClassCastException;

    .line 282
    .line 283
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 284
    .line 285
    .line 286
    throw v0

    .line 287
    :cond_a
    const/16 v17, 0x0

    .line 288
    .line 289
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n2;->N()V

    .line 290
    .line 291
    .line 292
    throw v17

    .line 293
    :cond_b
    move-object/from16 v0, p0

    .line 294
    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :cond_c
    move-object/from16 v0, p2

    .line 298
    .line 299
    invoke-virtual {v0, v9}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v0, p0

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_d
    const/16 v16, 0x1

    .line 307
    .line 308
    return v16
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LT1/n;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    return v0
.end method
