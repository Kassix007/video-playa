.class public final LZ5/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:LZ5/d0;

.field public static final b:LZ5/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ5/d0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ5/d0;->a:LZ5/d0;

    .line 7
    .line 8
    const-string v0, "kotlin.UByte"

    .line 9
    .line 10
    sget-object v1, LZ5/i;->a:LZ5/i;

    .line 11
    .line 12
    invoke-static {v1, v0}, LZ5/N;->a(LV5/a;Ljava/lang/String;)LZ5/x;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, LZ5/d0;->b:LZ5/x;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LZ5/d0;->b:LZ5/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LZ5/d0;->b:LZ5/x;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->m(LX5/f;)LY5/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, LY5/b;->s()B

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    new-instance v0, Lm5/p;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lm5/p;-><init>(B)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
