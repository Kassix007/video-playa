.class public abstract LH2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD2/c;

    .line 2
    .line 3
    invoke-direct {v0}, LD2/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH2/d;->a:LD2/c;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(LD2/j;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LD2/j;->f:LE2/d;

    .line 2
    .line 3
    iget-object v1, p0, LD2/j;->c:LF2/b;

    .line 4
    .line 5
    iget-object v2, p0, LD2/j;->w:LE2/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v3, :cond_2

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-ne v0, v4, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, LD2/j;->z:LD2/d;

    .line 20
    .line 21
    iget-object p0, p0, LD2/d;->a:LE2/i;

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    instance-of p0, v2, LE2/c;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of p0, v1, LF2/a;

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    instance-of p0, v2, LE2/f;

    .line 35
    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    check-cast v1, LF2/a;

    .line 39
    .line 40
    iget-object p0, v1, LF2/a;->r:Landroid/widget/ImageView;

    .line 41
    .line 42
    check-cast v2, LE2/f;

    .line 43
    .line 44
    iget-object v0, v2, LE2/f;->q:Landroid/widget/ImageView;

    .line 45
    .line 46
    if-ne p0, v0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p0, LC2/e;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    :goto_0
    return v3

    .line 56
    :cond_3
    const/4 p0, 0x0

    .line 57
    return p0
.end method
