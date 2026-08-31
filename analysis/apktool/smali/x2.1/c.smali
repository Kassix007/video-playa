.class public final Lx2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/g;


# instance fields
.field public final synthetic a:I

.field public final b:LD2/n;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LD2/n;I)V
    .locals 0

    .line 1
    iput p3, p0, Lx2/c;->a:I

    iput-object p1, p0, Lx2/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lx2/c;->b:LD2/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget p1, p0, Lx2/c;->a:I

    .line 2
    .line 3
    sget-object v0, Lv2/e;->r:Lv2/e;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lx2/c;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v3, p0, Lx2/c;->b:LD2/n;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    sget-object p1, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    instance-of p1, v2, Landroid/graphics/drawable/VectorDrawable;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    instance-of p1, v2, Lr2/o;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x1

    .line 26
    :cond_1
    new-instance p1, Lx2/d;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget-object v4, v3, LD2/n;->b:Landroid/graphics/Bitmap$Config;

    .line 31
    .line 32
    iget-object v5, v3, LD2/n;->d:LE2/h;

    .line 33
    .line 34
    iget-object v6, v3, LD2/n;->e:LE2/g;

    .line 35
    .line 36
    iget-boolean v7, v3, LD2/n;->f:Z

    .line 37
    .line 38
    invoke-static {v2, v4, v5, v6, v7}, Lcom/google/android/gms/internal/measurement/n2;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LE2/h;LE2/g;Z)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v3, v3, LD2/n;->a:Landroid/content/Context;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 49
    .line 50
    invoke-direct {v4, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 51
    .line 52
    .line 53
    move-object v2, v4

    .line 54
    :cond_2
    invoke-direct {p1, v2, v1, v0}, Lx2/d;-><init>(Landroid/graphics/drawable/Drawable;ZLv2/e;)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_0
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    :try_start_0
    new-instance p1, Lq6/g;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Lq6/g;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 69
    .line 70
    .line 71
    new-instance v1, Lx2/m;

    .line 72
    .line 73
    iget-object v2, v3, LD2/n;->a:Landroid/content/Context;

    .line 74
    .line 75
    new-instance v2, Lv2/m;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-direct {v2, p1, v3}, Lv2/m;-><init>(Lq6/i;La/a;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, v2, v3, v0}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :pswitch_1
    new-instance p1, Lx2/d;

    .line 91
    .line 92
    check-cast v2, Landroid/graphics/Bitmap;

    .line 93
    .line 94
    iget-object v3, v3, LD2/n;->a:Landroid/content/Context;

    .line 95
    .line 96
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 101
    .line 102
    invoke-direct {v4, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, v4, v1, v0}, Lx2/d;-><init>(Landroid/graphics/drawable/Drawable;ZLv2/e;)V

    .line 106
    .line 107
    .line 108
    return-object p1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
