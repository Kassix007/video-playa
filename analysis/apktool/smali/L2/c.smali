.class public final LL2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL2/g;


# instance fields
.field public final synthetic a:I

.field public final b:LU2/n;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LU2/n;I)V
    .locals 0

    .line 1
    iput p3, p0, LL2/c;->a:I

    iput-object p1, p0, LL2/c;->c:Ljava/lang/Object;

    iput-object p2, p0, LL2/c;->b:LU2/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget p1, p0, LL2/c;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, LJ2/h;->r:LJ2/h;

    .line 6
    .line 7
    iget-object v3, p0, LL2/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, LL2/c;->b:LU2/n;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    sget-object p1, LY2/j;->a:[Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    instance-of p1, v3, Landroid/graphics/drawable/VectorDrawable;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    instance-of p1, v3, Lr2/o;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p1, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move p1, v0

    .line 31
    :goto_1
    new-instance v5, LL2/h;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    invoke-static {v4}, LU2/i;->b(LU2/n;)Landroid/graphics/Bitmap$Config;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-object v7, v4, LU2/n;->b:LV2/h;

    .line 40
    .line 41
    iget-object v8, v4, LU2/n;->c:LV2/g;

    .line 42
    .line 43
    iget-object v9, v4, LU2/n;->d:LV2/d;

    .line 44
    .line 45
    sget-object v10, LV2/d;->r:LV2/d;

    .line 46
    .line 47
    if-ne v9, v10, :cond_2

    .line 48
    .line 49
    move v1, v0

    .line 50
    :cond_2
    invoke-static {v3, v6, v7, v8, v1}, Ly4/b;->l(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LV2/h;LV2/g;Z)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, v4, LU2/n;->a:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 61
    .line 62
    invoke-direct {v3, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-static {v3}, LI2/q;->c(Landroid/graphics/drawable/Drawable;)LI2/n;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {v5, v0, p1, v2}, LL2/h;-><init>(LI2/n;ZLJ2/h;)V

    .line 70
    .line 71
    .line 72
    return-object v5

    .line 73
    :pswitch_0
    new-instance p1, LL2/i;

    .line 74
    .line 75
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    new-instance v1, LL2/d;

    .line 78
    .line 79
    invoke-direct {v1, v3}, LL2/d;-><init>(Ljava/nio/ByteBuffer;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v4, v4, LU2/n;->f:Lq6/l;

    .line 87
    .line 88
    new-instance v5, LJ2/f;

    .line 89
    .line 90
    invoke-direct {v5, v3}, LJ2/f;-><init>(Ljava/nio/ByteBuffer;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, LJ2/s;

    .line 94
    .line 95
    invoke-direct {v3, v1, v4, v5}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p1, v3, v0, v2}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_1
    new-instance p1, Lq6/g;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    check-cast v3, [B

    .line 108
    .line 109
    invoke-virtual {p1, v3}, Lq6/g;->write([B)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v4, LU2/n;->f:Lq6/l;

    .line 113
    .line 114
    new-instance v3, LJ2/s;

    .line 115
    .line 116
    invoke-direct {v3, p1, v1, v0}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 117
    .line 118
    .line 119
    new-instance p1, LL2/i;

    .line 120
    .line 121
    invoke-direct {p1, v3, v0, v2}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 122
    .line 123
    .line 124
    return-object p1

    .line 125
    :pswitch_2
    new-instance p1, LL2/h;

    .line 126
    .line 127
    check-cast v3, Landroid/graphics/Bitmap;

    .line 128
    .line 129
    iget-object v0, v4, LU2/n;->a:Landroid/content/Context;

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 136
    .line 137
    invoke-direct {v4, v0, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v4}, LI2/q;->c(Landroid/graphics/drawable/Drawable;)LI2/n;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-direct {p1, v0, v1, v2}, LL2/h;-><init>(LI2/n;ZLJ2/h;)V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
