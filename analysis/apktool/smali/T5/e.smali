.class public final LT5/e;
.super LT5/h;
.source "SourceFile"


# static fields
.field public static final r:LT5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LT5/e;

    .line 2
    .line 3
    sget v2, LT5/k;->c:I

    .line 4
    .line 5
    sget v3, LT5/k;->d:I

    .line 6
    .line 7
    sget-wide v4, LT5/k;->e:J

    .line 8
    .line 9
    sget-object v6, LT5/k;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, LM5/s;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, LT5/c;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, LT5/c;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, LT5/h;->q:LT5/c;

    .line 20
    .line 21
    sput-object v0, LT5/e;->r:LT5/e;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final limitedParallelism(ILjava/lang/String;)LM5/s;
    .locals 1

    .line 1
    invoke-static {p1}, LR5/b;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, LT5/k;->c:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance p1, LR5/o;

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, LR5/o;-><init>(LM5/s;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    invoke-super {p0, p1, p2}, LM5/s;->limitedParallelism(ILjava/lang/String;)LM5/s;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object v0
.end method
