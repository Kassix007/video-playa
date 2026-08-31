.class public final LZ5/l;
.super LZ5/T;
.source "SourceFile"


# static fields
.field public static final c:LZ5/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ5/l;

    .line 2
    .line 3
    sget-object v1, LZ5/m;->a:LZ5/m;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LZ5/T;-><init>(LV5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ5/l;->c:LZ5/l;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(LY5/a;ILjava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p3, LZ5/k;

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
    invoke-interface {p1, v0, p2}, LY5/a;->y(LZ5/S;I)C

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p3}, LZ5/Q;->c(LZ5/Q;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p3, LZ5/k;->a:[C

    .line 18
    .line 19
    iget v0, p3, LZ5/k;->b:I

    .line 20
    .line 21
    add-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    iput v1, p3, LZ5/k;->b:I

    .line 24
    .line 25
    aput-char p1, p2, v0

    .line 26
    .line 27
    return-void
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, [C

    .line 2
    .line 3
    const-string v0, "<this>"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LZ5/k;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, LZ5/k;->a:[C

    .line 14
    .line 15
    array-length p1, p1

    .line 16
    iput p1, v0, LZ5/k;->b:I

    .line 17
    .line 18
    const/16 p1, 0xa

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LZ5/k;->b(I)V

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
    new-array v0, v0, [C

    .line 3
    .line 4
    return-object v0
.end method
