.class public final LZ5/p;
.super LZ5/T;
.source "SourceFile"


# static fields
.field public static final c:LZ5/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ5/p;

    .line 2
    .line 3
    sget-object v1, LZ5/q;->a:LZ5/q;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LZ5/T;-><init>(LV5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ5/p;->c:LZ5/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(LY5/a;ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p3, LZ5/o;

    .line 2
    .line 3
    const-string v0, "builder"

    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LZ5/T;->b:LZ5/S;

    .line 9
    .line 10
    invoke-interface {p1, v0, p2}, LY5/a;->u(LZ5/S;I)D

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    invoke-static {p3}, LZ5/Q;->c(LZ5/Q;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p3, LZ5/o;->a:[D

    .line 18
    .line 19
    iget v1, p3, LZ5/o;->b:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p3, LZ5/o;->b:I

    .line 24
    .line 25
    aput-wide p1, v0, v1

    .line 26
    .line 27
    return-void
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, [D

    .line 2
    .line 3
    const-string v0, "<this>"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LZ5/o;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, LZ5/o;->a:[D

    .line 14
    .line 15
    array-length p1, p1

    .line 16
    iput p1, v0, LZ5/o;->b:I

    .line 17
    .line 18
    const/16 p1, 0xa

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LZ5/o;->b(I)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [D

    .line 3
    .line 4
    return-object v0
.end method
