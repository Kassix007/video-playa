.class public final LZ5/c0;
.super LZ5/T;
.source "SourceFile"


# static fields
.field public static final c:LZ5/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ5/c0;

    .line 2
    .line 3
    sget-object v1, LZ5/d0;->a:LZ5/d0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LZ5/T;-><init>(LV5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ5/c0;->c:LZ5/c0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(LY5/a;ILjava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p3, LZ5/b0;

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
    invoke-interface {p1, v0, p2}, LY5/a;->r(LZ5/S;I)LY5/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, LY5/b;->s()B

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p3}, LZ5/Q;->c(LZ5/Q;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p3, LZ5/b0;->a:[B

    .line 22
    .line 23
    iget v0, p3, LZ5/b0;->b:I

    .line 24
    .line 25
    add-int/lit8 v1, v0, 0x1

    .line 26
    .line 27
    iput v1, p3, LZ5/b0;->b:I

    .line 28
    .line 29
    aput-byte p1, p2, v0

    .line 30
    .line 31
    return-void
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lm5/q;

    .line 2
    .line 3
    iget-object p1, p1, Lm5/q;->q:[B

    .line 4
    .line 5
    const-string v0, "$this$toBuilder"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, LZ5/b0;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LZ5/b0;->a:[B

    .line 16
    .line 17
    array-length p1, p1

    .line 18
    iput p1, v0, LZ5/b0;->b:I

    .line 19
    .line 20
    const/16 p1, 0xa

    .line 21
    .line 22
    invoke-virtual {v0, p1}, LZ5/b0;->b(I)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    new-instance v1, Lm5/q;

    .line 5
    .line 6
    invoke-direct {v1, v0}, Lm5/q;-><init>([B)V

    .line 7
    .line 8
    .line 9
    return-object v1
.end method
