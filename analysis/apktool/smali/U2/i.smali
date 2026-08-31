.class public abstract LU2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI2/l;

.field public static final b:LI2/l;

.field public static final c:LI2/l;

.field public static final d:LI2/l;

.field public static final e:LI2/l;

.field public static final f:LI2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LI2/l;

    .line 2
    .line 3
    sget-object v1, LY2/j;->b:Landroid/graphics/Bitmap$Config;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU2/i;->a:LI2/l;

    .line 9
    .line 10
    new-instance v0, LI2/l;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LU2/i;->b:LI2/l;

    .line 17
    .line 18
    new-instance v0, LI2/l;

    .line 19
    .line 20
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-direct {v0, v2}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LU2/i;->c:LI2/l;

    .line 26
    .line 27
    new-instance v0, LI2/l;

    .line 28
    .line 29
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LU2/i;->d:LI2/l;

    .line 33
    .line 34
    new-instance v0, LI2/l;

    .line 35
    .line 36
    invoke-direct {v0, v2}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LU2/i;->e:LI2/l;

    .line 40
    .line 41
    new-instance v0, LI2/l;

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, LU2/i;->f:LI2/l;

    .line 49
    .line 50
    return-void
.end method

.method public static final a(LU2/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU2/d;->k:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, LI2/k;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LI2/k;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of v1, v0, LI2/m;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, LI2/m;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, LI2/k;

    .line 20
    .line 21
    invoke-direct {v1, v0}, LI2/k;-><init>(LI2/m;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, LU2/d;->k:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    iget-object v0, v0, LI2/k;->a:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    sget-object v1, LU2/i;->e:LI2/l;

    .line 32
    .line 33
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static final b(LU2/n;)Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, LU2/i;->a:LI2/l;

    .line 2
    .line 3
    invoke-static {p0, v0}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    return-object p0
.end method
