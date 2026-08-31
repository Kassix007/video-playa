.class public abstract La6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La6/b;


# instance fields
.field public final a:La6/j;

.field public final b:LO3/B;

.field public final c:Lk3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La6/b;

    .line 2
    .line 3
    new-instance v1, La6/j;

    .line 4
    .line 5
    const/4 v6, 0x1

    .line 6
    sget-object v7, La6/a;->q:La6/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    const-string v4, "    "

    .line 11
    .line 12
    const-string v5, "type"

    .line 13
    .line 14
    invoke-direct/range {v1 .. v7}, La6/j;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLa6/a;)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lc6/a;->a:LO3/B;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, La6/c;-><init>(La6/j;LO3/B;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La6/c;->d:La6/b;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(La6/j;LO3/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La6/c;->a:La6/j;

    .line 5
    .line 6
    iput-object p2, p0, La6/c;->b:LO3/B;

    .line 7
    .line 8
    new-instance p1, Lk3/c;

    .line 9
    .line 10
    const/16 p2, 0x16

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lk3/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La6/c;->c:Lk3/c;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(LV5/a;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LD/u;

    .line 12
    .line 13
    invoke-direct {v0, p2}, LD/u;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lb6/i;

    .line 17
    .line 18
    sget-object v2, Lb6/l;->s:Lb6/l;

    .line 19
    .line 20
    invoke-interface {p1}, LV5/a;->b()LX5/f;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v1, p0, v2, v0, v3}, Lb6/i;-><init>(La6/c;Lb6/l;LD/u;LX5/f;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lb6/i;->p(LV5/a;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0}, LD/u;->e()B

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "Expected EOF after parsing, but had "

    .line 43
    .line 44
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget v1, v0, LD/u;->b:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p2, " instead"

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 p2, 0x0

    .line 68
    const/4 v1, 0x6

    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-static {v0, p1, p2, v2, v1}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 71
    .line 72
    .line 73
    throw v2
.end method
